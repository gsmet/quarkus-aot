package fr.spacefox.perftests.quarkus.data.entity192;

import fr.spacefox.perftests.quarkus.core.service192.model.Model192;

final class Mapper {
    private Mapper() {}

    public static Model192 of(Entity192 entity) {
        return new Model192(entity.getId(), entity.getField());
    }
}
