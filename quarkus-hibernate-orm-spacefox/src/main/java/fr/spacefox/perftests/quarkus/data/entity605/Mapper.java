package fr.spacefox.perftests.quarkus.data.entity605;

import fr.spacefox.perftests.quarkus.core.service605.model.Model605;

final class Mapper {
    private Mapper() {}

    public static Model605 of(Entity605 entity) {
        return new Model605(entity.getId(), entity.getField());
    }
}
