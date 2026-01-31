package fr.spacefox.perftests.quarkus.data.entity988;

import fr.spacefox.perftests.quarkus.core.service988.model.Model988;

final class Mapper {
    private Mapper() {}

    public static Model988 of(Entity988 entity) {
        return new Model988(entity.getId(), entity.getField());
    }
}
