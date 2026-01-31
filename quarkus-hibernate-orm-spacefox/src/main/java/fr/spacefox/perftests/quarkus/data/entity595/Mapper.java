package fr.spacefox.perftests.quarkus.data.entity595;

import fr.spacefox.perftests.quarkus.core.service595.model.Model595;

final class Mapper {
    private Mapper() {}

    public static Model595 of(Entity595 entity) {
        return new Model595(entity.getId(), entity.getField());
    }
}
