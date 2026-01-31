package fr.spacefox.perftests.quarkus.data.entity165;

import fr.spacefox.perftests.quarkus.core.service165.model.Model165;

final class Mapper {
    private Mapper() {}

    public static Model165 of(Entity165 entity) {
        return new Model165(entity.getId(), entity.getField());
    }
}
