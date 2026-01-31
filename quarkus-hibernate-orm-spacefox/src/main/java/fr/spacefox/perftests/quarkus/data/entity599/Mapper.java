package fr.spacefox.perftests.quarkus.data.entity599;

import fr.spacefox.perftests.quarkus.core.service599.model.Model599;

final class Mapper {
    private Mapper() {}

    public static Model599 of(Entity599 entity) {
        return new Model599(entity.getId(), entity.getField());
    }
}
