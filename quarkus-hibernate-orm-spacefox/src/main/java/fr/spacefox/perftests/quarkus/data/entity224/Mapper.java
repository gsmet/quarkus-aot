package fr.spacefox.perftests.quarkus.data.entity224;

import fr.spacefox.perftests.quarkus.core.service224.model.Model224;

final class Mapper {
    private Mapper() {}

    public static Model224 of(Entity224 entity) {
        return new Model224(entity.getId(), entity.getField());
    }
}
