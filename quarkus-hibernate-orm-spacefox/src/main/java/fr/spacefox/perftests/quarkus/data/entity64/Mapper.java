package fr.spacefox.perftests.quarkus.data.entity64;

import fr.spacefox.perftests.quarkus.core.service64.model.Model64;

final class Mapper {
    private Mapper() {}

    public static Model64 of(Entity64 entity) {
        return new Model64(entity.getId(), entity.getField());
    }
}
