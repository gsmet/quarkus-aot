package fr.spacefox.perftests.quarkus.data.entity919;

import fr.spacefox.perftests.quarkus.core.service919.model.Model919;

final class Mapper {
    private Mapper() {}

    public static Model919 of(Entity919 entity) {
        return new Model919(entity.getId(), entity.getField());
    }
}
