package fr.spacefox.perftests.quarkus.data.entity274;

import fr.spacefox.perftests.quarkus.core.service274.model.Model274;

final class Mapper {
    private Mapper() {}

    public static Model274 of(Entity274 entity) {
        return new Model274(entity.getId(), entity.getField());
    }
}
