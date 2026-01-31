package fr.spacefox.perftests.quarkus.data.entity440;

import fr.spacefox.perftests.quarkus.core.service440.model.Model440;

final class Mapper {
    private Mapper() {}

    public static Model440 of(Entity440 entity) {
        return new Model440(entity.getId(), entity.getField());
    }
}
