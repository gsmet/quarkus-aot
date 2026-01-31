package fr.spacefox.perftests.quarkus.data.entity275;

import fr.spacefox.perftests.quarkus.core.service275.model.Model275;

final class Mapper {
    private Mapper() {}

    public static Model275 of(Entity275 entity) {
        return new Model275(entity.getId(), entity.getField());
    }
}
