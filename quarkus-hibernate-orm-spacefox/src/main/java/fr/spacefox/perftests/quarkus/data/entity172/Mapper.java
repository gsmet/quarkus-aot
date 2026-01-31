package fr.spacefox.perftests.quarkus.data.entity172;

import fr.spacefox.perftests.quarkus.core.service172.model.Model172;

final class Mapper {
    private Mapper() {}

    public static Model172 of(Entity172 entity) {
        return new Model172(entity.getId(), entity.getField());
    }
}
