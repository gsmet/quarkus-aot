package fr.spacefox.perftests.quarkus.data.entity425;

import fr.spacefox.perftests.quarkus.core.service425.model.Model425;

final class Mapper {
    private Mapper() {}

    public static Model425 of(Entity425 entity) {
        return new Model425(entity.getId(), entity.getField());
    }
}
