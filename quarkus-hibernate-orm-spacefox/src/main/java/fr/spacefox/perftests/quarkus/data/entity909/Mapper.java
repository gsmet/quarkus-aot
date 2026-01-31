package fr.spacefox.perftests.quarkus.data.entity909;

import fr.spacefox.perftests.quarkus.core.service909.model.Model909;

final class Mapper {
    private Mapper() {}

    public static Model909 of(Entity909 entity) {
        return new Model909(entity.getId(), entity.getField());
    }
}
