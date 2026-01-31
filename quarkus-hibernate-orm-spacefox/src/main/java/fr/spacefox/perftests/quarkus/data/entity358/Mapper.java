package fr.spacefox.perftests.quarkus.data.entity358;

import fr.spacefox.perftests.quarkus.core.service358.model.Model358;

final class Mapper {
    private Mapper() {}

    public static Model358 of(Entity358 entity) {
        return new Model358(entity.getId(), entity.getField());
    }
}
