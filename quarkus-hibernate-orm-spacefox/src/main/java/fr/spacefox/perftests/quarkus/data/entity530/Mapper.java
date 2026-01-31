package fr.spacefox.perftests.quarkus.data.entity530;

import fr.spacefox.perftests.quarkus.core.service530.model.Model530;

final class Mapper {
    private Mapper() {}

    public static Model530 of(Entity530 entity) {
        return new Model530(entity.getId(), entity.getField());
    }
}
