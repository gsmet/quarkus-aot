package fr.spacefox.perftests.quarkus.data.entity291;

import fr.spacefox.perftests.quarkus.core.service291.model.Model291;

final class Mapper {
    private Mapper() {}

    public static Model291 of(Entity291 entity) {
        return new Model291(entity.getId(), entity.getField());
    }
}
