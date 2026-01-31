package fr.spacefox.perftests.quarkus.data.entity533;

import fr.spacefox.perftests.quarkus.core.service533.model.Model533;

final class Mapper {
    private Mapper() {}

    public static Model533 of(Entity533 entity) {
        return new Model533(entity.getId(), entity.getField());
    }
}
