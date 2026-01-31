package fr.spacefox.perftests.quarkus.data.entity441;

import fr.spacefox.perftests.quarkus.core.service441.model.Model441;

final class Mapper {
    private Mapper() {}

    public static Model441 of(Entity441 entity) {
        return new Model441(entity.getId(), entity.getField());
    }
}
