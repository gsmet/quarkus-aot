package fr.spacefox.perftests.quarkus.data.entity337;

import fr.spacefox.perftests.quarkus.core.service337.model.Model337;

final class Mapper {
    private Mapper() {}

    public static Model337 of(Entity337 entity) {
        return new Model337(entity.getId(), entity.getField());
    }
}
