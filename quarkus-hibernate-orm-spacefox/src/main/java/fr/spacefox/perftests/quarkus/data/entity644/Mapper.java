package fr.spacefox.perftests.quarkus.data.entity644;

import fr.spacefox.perftests.quarkus.core.service644.model.Model644;

final class Mapper {
    private Mapper() {}

    public static Model644 of(Entity644 entity) {
        return new Model644(entity.getId(), entity.getField());
    }
}
