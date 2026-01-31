package fr.spacefox.perftests.quarkus.data.entity32;

import fr.spacefox.perftests.quarkus.core.service32.model.Model32;

final class Mapper {
    private Mapper() {}

    public static Model32 of(Entity32 entity) {
        return new Model32(entity.getId(), entity.getField());
    }
}
