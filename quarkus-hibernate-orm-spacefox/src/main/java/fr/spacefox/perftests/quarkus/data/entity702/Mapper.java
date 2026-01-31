package fr.spacefox.perftests.quarkus.data.entity702;

import fr.spacefox.perftests.quarkus.core.service702.model.Model702;

final class Mapper {
    private Mapper() {}

    public static Model702 of(Entity702 entity) {
        return new Model702(entity.getId(), entity.getField());
    }
}
