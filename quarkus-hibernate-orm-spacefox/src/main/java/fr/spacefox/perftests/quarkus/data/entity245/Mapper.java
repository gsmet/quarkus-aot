package fr.spacefox.perftests.quarkus.data.entity245;

import fr.spacefox.perftests.quarkus.core.service245.model.Model245;

final class Mapper {
    private Mapper() {}

    public static Model245 of(Entity245 entity) {
        return new Model245(entity.getId(), entity.getField());
    }
}
