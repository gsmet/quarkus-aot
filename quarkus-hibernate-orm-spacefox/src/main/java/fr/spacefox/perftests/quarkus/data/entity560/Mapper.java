package fr.spacefox.perftests.quarkus.data.entity560;

import fr.spacefox.perftests.quarkus.core.service560.model.Model560;

final class Mapper {
    private Mapper() {}

    public static Model560 of(Entity560 entity) {
        return new Model560(entity.getId(), entity.getField());
    }
}
