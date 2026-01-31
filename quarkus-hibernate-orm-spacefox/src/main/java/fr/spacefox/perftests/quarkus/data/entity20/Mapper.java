package fr.spacefox.perftests.quarkus.data.entity20;

import fr.spacefox.perftests.quarkus.core.service20.model.Model20;

final class Mapper {
    private Mapper() {}

    public static Model20 of(Entity20 entity) {
        return new Model20(entity.getId(), entity.getField());
    }
}
