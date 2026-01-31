package fr.spacefox.perftests.quarkus.data.entity929;

import fr.spacefox.perftests.quarkus.core.service929.model.Model929;

final class Mapper {
    private Mapper() {}

    public static Model929 of(Entity929 entity) {
        return new Model929(entity.getId(), entity.getField());
    }
}
