package fr.spacefox.perftests.quarkus.data.entity218;

import fr.spacefox.perftests.quarkus.core.service218.model.Model218;

final class Mapper {
    private Mapper() {}

    public static Model218 of(Entity218 entity) {
        return new Model218(entity.getId(), entity.getField());
    }
}
