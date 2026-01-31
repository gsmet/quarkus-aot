package fr.spacefox.perftests.quarkus.data.entity366;

import fr.spacefox.perftests.quarkus.core.service366.model.Model366;

final class Mapper {
    private Mapper() {}

    public static Model366 of(Entity366 entity) {
        return new Model366(entity.getId(), entity.getField());
    }
}
