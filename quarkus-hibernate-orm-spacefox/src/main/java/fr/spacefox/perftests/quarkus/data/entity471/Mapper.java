package fr.spacefox.perftests.quarkus.data.entity471;

import fr.spacefox.perftests.quarkus.core.service471.model.Model471;

final class Mapper {
    private Mapper() {}

    public static Model471 of(Entity471 entity) {
        return new Model471(entity.getId(), entity.getField());
    }
}
