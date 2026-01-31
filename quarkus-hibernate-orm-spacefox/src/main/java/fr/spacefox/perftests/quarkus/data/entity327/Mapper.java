package fr.spacefox.perftests.quarkus.data.entity327;

import fr.spacefox.perftests.quarkus.core.service327.model.Model327;

final class Mapper {
    private Mapper() {}

    public static Model327 of(Entity327 entity) {
        return new Model327(entity.getId(), entity.getField());
    }
}
