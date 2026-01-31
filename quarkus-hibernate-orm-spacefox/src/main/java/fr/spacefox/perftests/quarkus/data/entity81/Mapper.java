package fr.spacefox.perftests.quarkus.data.entity81;

import fr.spacefox.perftests.quarkus.core.service81.model.Model81;

final class Mapper {
    private Mapper() {}

    public static Model81 of(Entity81 entity) {
        return new Model81(entity.getId(), entity.getField());
    }
}
