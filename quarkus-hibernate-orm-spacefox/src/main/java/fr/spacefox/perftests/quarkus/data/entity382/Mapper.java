package fr.spacefox.perftests.quarkus.data.entity382;

import fr.spacefox.perftests.quarkus.core.service382.model.Model382;

final class Mapper {
    private Mapper() {}

    public static Model382 of(Entity382 entity) {
        return new Model382(entity.getId(), entity.getField());
    }
}
