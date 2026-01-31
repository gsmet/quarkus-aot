package fr.spacefox.perftests.quarkus.data.entity990;

import fr.spacefox.perftests.quarkus.core.service990.model.Model990;

final class Mapper {
    private Mapper() {}

    public static Model990 of(Entity990 entity) {
        return new Model990(entity.getId(), entity.getField());
    }
}
