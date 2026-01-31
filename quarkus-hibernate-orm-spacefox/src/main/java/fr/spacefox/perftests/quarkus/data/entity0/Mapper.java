package fr.spacefox.perftests.quarkus.data.entity0;

import fr.spacefox.perftests.quarkus.core.service0.model.Model0;

final class Mapper {
    private Mapper() {}

    public static Model0 of(Entity0 entity) {
        return new Model0(entity.getId(), entity.getField());
    }
}
