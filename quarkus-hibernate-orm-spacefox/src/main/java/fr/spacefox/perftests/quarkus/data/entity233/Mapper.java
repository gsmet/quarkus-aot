package fr.spacefox.perftests.quarkus.data.entity233;

import fr.spacefox.perftests.quarkus.core.service233.model.Model233;

final class Mapper {
    private Mapper() {}

    public static Model233 of(Entity233 entity) {
        return new Model233(entity.getId(), entity.getField());
    }
}
