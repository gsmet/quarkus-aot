package fr.spacefox.perftests.quarkus.data.entity378;

import fr.spacefox.perftests.quarkus.core.service378.model.Model378;

final class Mapper {
    private Mapper() {}

    public static Model378 of(Entity378 entity) {
        return new Model378(entity.getId(), entity.getField());
    }
}
