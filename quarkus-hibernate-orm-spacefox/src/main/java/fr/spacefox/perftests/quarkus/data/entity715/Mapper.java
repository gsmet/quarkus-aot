package fr.spacefox.perftests.quarkus.data.entity715;

import fr.spacefox.perftests.quarkus.core.service715.model.Model715;

final class Mapper {
    private Mapper() {}

    public static Model715 of(Entity715 entity) {
        return new Model715(entity.getId(), entity.getField());
    }
}
