package fr.spacefox.perftests.quarkus.data.entity773;

import fr.spacefox.perftests.quarkus.core.service773.model.Model773;

final class Mapper {
    private Mapper() {}

    public static Model773 of(Entity773 entity) {
        return new Model773(entity.getId(), entity.getField());
    }
}
