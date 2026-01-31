package fr.spacefox.perftests.quarkus.data.entity800;

import fr.spacefox.perftests.quarkus.core.service800.model.Model800;

final class Mapper {
    private Mapper() {}

    public static Model800 of(Entity800 entity) {
        return new Model800(entity.getId(), entity.getField());
    }
}
