package fr.spacefox.perftests.quarkus.data.entity254;

import fr.spacefox.perftests.quarkus.core.service254.model.Model254;

final class Mapper {
    private Mapper() {}

    public static Model254 of(Entity254 entity) {
        return new Model254(entity.getId(), entity.getField());
    }
}
