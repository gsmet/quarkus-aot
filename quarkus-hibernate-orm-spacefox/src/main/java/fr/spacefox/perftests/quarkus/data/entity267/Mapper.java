package fr.spacefox.perftests.quarkus.data.entity267;

import fr.spacefox.perftests.quarkus.core.service267.model.Model267;

final class Mapper {
    private Mapper() {}

    public static Model267 of(Entity267 entity) {
        return new Model267(entity.getId(), entity.getField());
    }
}
