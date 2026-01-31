package fr.spacefox.perftests.quarkus.data.entity958;

import fr.spacefox.perftests.quarkus.core.service958.model.Model958;

final class Mapper {
    private Mapper() {}

    public static Model958 of(Entity958 entity) {
        return new Model958(entity.getId(), entity.getField());
    }
}
