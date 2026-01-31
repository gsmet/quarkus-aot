package fr.spacefox.perftests.quarkus.data.entity283;

import fr.spacefox.perftests.quarkus.core.service283.model.Model283;

final class Mapper {
    private Mapper() {}

    public static Model283 of(Entity283 entity) {
        return new Model283(entity.getId(), entity.getField());
    }
}
