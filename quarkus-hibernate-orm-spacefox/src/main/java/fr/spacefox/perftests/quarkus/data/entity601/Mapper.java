package fr.spacefox.perftests.quarkus.data.entity601;

import fr.spacefox.perftests.quarkus.core.service601.model.Model601;

final class Mapper {
    private Mapper() {}

    public static Model601 of(Entity601 entity) {
        return new Model601(entity.getId(), entity.getField());
    }
}
