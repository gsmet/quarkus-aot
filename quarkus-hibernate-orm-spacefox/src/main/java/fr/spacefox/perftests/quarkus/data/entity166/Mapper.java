package fr.spacefox.perftests.quarkus.data.entity166;

import fr.spacefox.perftests.quarkus.core.service166.model.Model166;

final class Mapper {
    private Mapper() {}

    public static Model166 of(Entity166 entity) {
        return new Model166(entity.getId(), entity.getField());
    }
}
