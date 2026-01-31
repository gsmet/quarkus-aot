package fr.spacefox.perftests.quarkus.data.entity139;

import fr.spacefox.perftests.quarkus.core.service139.model.Model139;

final class Mapper {
    private Mapper() {}

    public static Model139 of(Entity139 entity) {
        return new Model139(entity.getId(), entity.getField());
    }
}
