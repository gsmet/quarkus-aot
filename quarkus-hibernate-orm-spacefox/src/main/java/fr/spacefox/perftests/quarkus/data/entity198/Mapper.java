package fr.spacefox.perftests.quarkus.data.entity198;

import fr.spacefox.perftests.quarkus.core.service198.model.Model198;

final class Mapper {
    private Mapper() {}

    public static Model198 of(Entity198 entity) {
        return new Model198(entity.getId(), entity.getField());
    }
}
