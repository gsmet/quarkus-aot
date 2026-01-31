package fr.spacefox.perftests.quarkus.data.entity788;

import fr.spacefox.perftests.quarkus.core.service788.model.Model788;

final class Mapper {
    private Mapper() {}

    public static Model788 of(Entity788 entity) {
        return new Model788(entity.getId(), entity.getField());
    }
}
