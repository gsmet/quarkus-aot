package fr.spacefox.perftests.quarkus.data.entity483;

import fr.spacefox.perftests.quarkus.core.service483.model.Model483;

final class Mapper {
    private Mapper() {}

    public static Model483 of(Entity483 entity) {
        return new Model483(entity.getId(), entity.getField());
    }
}
