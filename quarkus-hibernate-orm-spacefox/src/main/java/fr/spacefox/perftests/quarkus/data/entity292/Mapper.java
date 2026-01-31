package fr.spacefox.perftests.quarkus.data.entity292;

import fr.spacefox.perftests.quarkus.core.service292.model.Model292;

final class Mapper {
    private Mapper() {}

    public static Model292 of(Entity292 entity) {
        return new Model292(entity.getId(), entity.getField());
    }
}
