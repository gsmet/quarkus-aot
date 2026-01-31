package fr.spacefox.perftests.quarkus.data.entity402;

import fr.spacefox.perftests.quarkus.core.service402.model.Model402;

final class Mapper {
    private Mapper() {}

    public static Model402 of(Entity402 entity) {
        return new Model402(entity.getId(), entity.getField());
    }
}
