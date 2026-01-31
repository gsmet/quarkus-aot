package fr.spacefox.perftests.quarkus.data.entity552;

import fr.spacefox.perftests.quarkus.core.service552.model.Model552;

final class Mapper {
    private Mapper() {}

    public static Model552 of(Entity552 entity) {
        return new Model552(entity.getId(), entity.getField());
    }
}
