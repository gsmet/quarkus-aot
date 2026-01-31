package fr.spacefox.perftests.quarkus.data.entity880;

import fr.spacefox.perftests.quarkus.core.service880.model.Model880;

final class Mapper {
    private Mapper() {}

    public static Model880 of(Entity880 entity) {
        return new Model880(entity.getId(), entity.getField());
    }
}
