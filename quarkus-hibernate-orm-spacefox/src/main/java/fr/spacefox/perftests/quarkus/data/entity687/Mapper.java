package fr.spacefox.perftests.quarkus.data.entity687;

import fr.spacefox.perftests.quarkus.core.service687.model.Model687;

final class Mapper {
    private Mapper() {}

    public static Model687 of(Entity687 entity) {
        return new Model687(entity.getId(), entity.getField());
    }
}
