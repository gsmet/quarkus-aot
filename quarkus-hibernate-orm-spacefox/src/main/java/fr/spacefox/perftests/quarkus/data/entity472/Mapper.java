package fr.spacefox.perftests.quarkus.data.entity472;

import fr.spacefox.perftests.quarkus.core.service472.model.Model472;

final class Mapper {
    private Mapper() {}

    public static Model472 of(Entity472 entity) {
        return new Model472(entity.getId(), entity.getField());
    }
}
