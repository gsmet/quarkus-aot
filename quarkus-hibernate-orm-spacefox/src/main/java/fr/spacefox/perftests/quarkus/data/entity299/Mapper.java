package fr.spacefox.perftests.quarkus.data.entity299;

import fr.spacefox.perftests.quarkus.core.service299.model.Model299;

final class Mapper {
    private Mapper() {}

    public static Model299 of(Entity299 entity) {
        return new Model299(entity.getId(), entity.getField());
    }
}
