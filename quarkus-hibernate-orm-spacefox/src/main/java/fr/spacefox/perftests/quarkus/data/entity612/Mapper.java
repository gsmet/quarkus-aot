package fr.spacefox.perftests.quarkus.data.entity612;

import fr.spacefox.perftests.quarkus.core.service612.model.Model612;

final class Mapper {
    private Mapper() {}

    public static Model612 of(Entity612 entity) {
        return new Model612(entity.getId(), entity.getField());
    }
}
