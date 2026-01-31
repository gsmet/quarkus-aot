package fr.spacefox.perftests.quarkus.data.entity813;

import fr.spacefox.perftests.quarkus.core.service813.model.Model813;

final class Mapper {
    private Mapper() {}

    public static Model813 of(Entity813 entity) {
        return new Model813(entity.getId(), entity.getField());
    }
}
