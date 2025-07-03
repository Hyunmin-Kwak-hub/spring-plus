package org.example.expert.domain.todo.spec;

import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDateTime;

public class TodoSpecs {

    public static Specification<Todo> equalWeather(String weather) {
        return (root, query, criteriaBuilder) ->
                weather == null ? null : criteriaBuilder.equal(root.get("weather"), weather);
    }

    public static Specification<Todo> updatedAfter(LocalDateTime start) {
        return (root, query, criteriaBuilder) ->
                start == null ? null : criteriaBuilder.greaterThanOrEqualTo(root.get("updatedAfter"), start);
    }

    public static Specification<Todo> updatedBefore(LocalDateTime end) {
        return (root, query, criteriaBuilder)->
                end == null ? null : criteriaBuilder.greaterThanOrEqualTo(root.get("updatedBefore"), end);
    }
}
