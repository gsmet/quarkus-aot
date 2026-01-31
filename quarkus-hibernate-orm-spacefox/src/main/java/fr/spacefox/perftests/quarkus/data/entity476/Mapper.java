package fr.spacefox.perftests.quarkus.data.entity476;

import fr.spacefox.perftests.quarkus.core.service476.model.Model476;

final class Mapper {
    private Mapper() {}

    public static Model476 of(Entity476 entity) {
        return new Model476(entity.getId(), entity.getField());
    }
}
