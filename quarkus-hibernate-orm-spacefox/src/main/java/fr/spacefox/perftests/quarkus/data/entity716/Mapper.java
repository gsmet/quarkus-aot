package fr.spacefox.perftests.quarkus.data.entity716;

import fr.spacefox.perftests.quarkus.core.service716.model.Model716;

final class Mapper {
    private Mapper() {}

    public static Model716 of(Entity716 entity) {
        return new Model716(entity.getId(), entity.getField());
    }
}
