package fr.spacefox.perftests.quarkus.data.entity122;

import fr.spacefox.perftests.quarkus.core.service122.model.Model122;

final class Mapper {
    private Mapper() {}

    public static Model122 of(Entity122 entity) {
        return new Model122(entity.getId(), entity.getField());
    }
}
