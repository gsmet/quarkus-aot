package fr.spacefox.perftests.quarkus.data.entity343;

import fr.spacefox.perftests.quarkus.core.service343.model.Model343;

final class Mapper {
    private Mapper() {}

    public static Model343 of(Entity343 entity) {
        return new Model343(entity.getId(), entity.getField());
    }
}
