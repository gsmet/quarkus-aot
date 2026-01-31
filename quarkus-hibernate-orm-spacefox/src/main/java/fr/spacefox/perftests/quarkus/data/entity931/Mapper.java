package fr.spacefox.perftests.quarkus.data.entity931;

import fr.spacefox.perftests.quarkus.core.service931.model.Model931;

final class Mapper {
    private Mapper() {}

    public static Model931 of(Entity931 entity) {
        return new Model931(entity.getId(), entity.getField());
    }
}
