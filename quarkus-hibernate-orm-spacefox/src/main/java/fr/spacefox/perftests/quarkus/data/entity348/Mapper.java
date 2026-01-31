package fr.spacefox.perftests.quarkus.data.entity348;

import fr.spacefox.perftests.quarkus.core.service348.model.Model348;

final class Mapper {
    private Mapper() {}

    public static Model348 of(Entity348 entity) {
        return new Model348(entity.getId(), entity.getField());
    }
}
