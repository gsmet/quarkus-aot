package fr.spacefox.perftests.quarkus.data.entity455;

import fr.spacefox.perftests.quarkus.core.service455.model.Model455;

final class Mapper {
    private Mapper() {}

    public static Model455 of(Entity455 entity) {
        return new Model455(entity.getId(), entity.getField());
    }
}
