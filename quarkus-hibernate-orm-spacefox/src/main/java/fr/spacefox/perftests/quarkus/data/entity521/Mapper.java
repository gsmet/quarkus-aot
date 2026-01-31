package fr.spacefox.perftests.quarkus.data.entity521;

import fr.spacefox.perftests.quarkus.core.service521.model.Model521;

final class Mapper {
    private Mapper() {}

    public static Model521 of(Entity521 entity) {
        return new Model521(entity.getId(), entity.getField());
    }
}
