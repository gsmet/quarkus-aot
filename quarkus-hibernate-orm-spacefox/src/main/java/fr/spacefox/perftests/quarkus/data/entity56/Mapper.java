package fr.spacefox.perftests.quarkus.data.entity56;

import fr.spacefox.perftests.quarkus.core.service56.model.Model56;

final class Mapper {
    private Mapper() {}

    public static Model56 of(Entity56 entity) {
        return new Model56(entity.getId(), entity.getField());
    }
}
