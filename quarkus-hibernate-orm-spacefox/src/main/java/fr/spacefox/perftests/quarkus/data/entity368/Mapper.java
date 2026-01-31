package fr.spacefox.perftests.quarkus.data.entity368;

import fr.spacefox.perftests.quarkus.core.service368.model.Model368;

final class Mapper {
    private Mapper() {}

    public static Model368 of(Entity368 entity) {
        return new Model368(entity.getId(), entity.getField());
    }
}
