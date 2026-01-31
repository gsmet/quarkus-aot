package fr.spacefox.perftests.quarkus.data.entity918;

import fr.spacefox.perftests.quarkus.core.service918.model.Model918;

final class Mapper {
    private Mapper() {}

    public static Model918 of(Entity918 entity) {
        return new Model918(entity.getId(), entity.getField());
    }
}
