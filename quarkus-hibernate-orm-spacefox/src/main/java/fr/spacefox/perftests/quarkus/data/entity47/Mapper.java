package fr.spacefox.perftests.quarkus.data.entity47;

import fr.spacefox.perftests.quarkus.core.service47.model.Model47;

final class Mapper {
    private Mapper() {}

    public static Model47 of(Entity47 entity) {
        return new Model47(entity.getId(), entity.getField());
    }
}
