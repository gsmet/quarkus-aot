package fr.spacefox.perftests.quarkus.data.entity844;

import fr.spacefox.perftests.quarkus.core.service844.model.Model844;

final class Mapper {
    private Mapper() {}

    public static Model844 of(Entity844 entity) {
        return new Model844(entity.getId(), entity.getField());
    }
}
