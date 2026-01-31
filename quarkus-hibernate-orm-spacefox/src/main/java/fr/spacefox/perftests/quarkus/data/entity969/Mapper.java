package fr.spacefox.perftests.quarkus.data.entity969;

import fr.spacefox.perftests.quarkus.core.service969.model.Model969;

final class Mapper {
    private Mapper() {}

    public static Model969 of(Entity969 entity) {
        return new Model969(entity.getId(), entity.getField());
    }
}
