package fr.spacefox.perftests.quarkus.data.entity259;

import fr.spacefox.perftests.quarkus.core.service259.model.Model259;

final class Mapper {
    private Mapper() {}

    public static Model259 of(Entity259 entity) {
        return new Model259(entity.getId(), entity.getField());
    }
}
