package fr.spacefox.perftests.quarkus.data.entity363;

import fr.spacefox.perftests.quarkus.core.service363.model.Model363;

final class Mapper {
    private Mapper() {}

    public static Model363 of(Entity363 entity) {
        return new Model363(entity.getId(), entity.getField());
    }
}
