package fr.spacefox.perftests.quarkus.data.entity31;

import fr.spacefox.perftests.quarkus.core.service31.model.Model31;

final class Mapper {
    private Mapper() {}

    public static Model31 of(Entity31 entity) {
        return new Model31(entity.getId(), entity.getField());
    }
}
