package fr.spacefox.perftests.quarkus.data.entity548;

import fr.spacefox.perftests.quarkus.core.service548.model.Model548;

final class Mapper {
    private Mapper() {}

    public static Model548 of(Entity548 entity) {
        return new Model548(entity.getId(), entity.getField());
    }
}
