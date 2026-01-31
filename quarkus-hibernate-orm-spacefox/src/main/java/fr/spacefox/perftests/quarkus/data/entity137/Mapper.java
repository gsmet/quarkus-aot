package fr.spacefox.perftests.quarkus.data.entity137;

import fr.spacefox.perftests.quarkus.core.service137.model.Model137;

final class Mapper {
    private Mapper() {}

    public static Model137 of(Entity137 entity) {
        return new Model137(entity.getId(), entity.getField());
    }
}
