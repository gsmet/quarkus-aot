package fr.spacefox.perftests.quarkus.data.entity63;

import fr.spacefox.perftests.quarkus.core.service63.model.Model63;

final class Mapper {
    private Mapper() {}

    public static Model63 of(Entity63 entity) {
        return new Model63(entity.getId(), entity.getField());
    }
}
