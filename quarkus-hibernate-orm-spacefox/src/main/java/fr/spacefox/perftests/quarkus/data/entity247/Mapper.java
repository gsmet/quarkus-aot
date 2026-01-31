package fr.spacefox.perftests.quarkus.data.entity247;

import fr.spacefox.perftests.quarkus.core.service247.model.Model247;

final class Mapper {
    private Mapper() {}

    public static Model247 of(Entity247 entity) {
        return new Model247(entity.getId(), entity.getField());
    }
}
