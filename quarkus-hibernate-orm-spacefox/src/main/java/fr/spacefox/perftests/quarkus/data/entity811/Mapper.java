package fr.spacefox.perftests.quarkus.data.entity811;

import fr.spacefox.perftests.quarkus.core.service811.model.Model811;

final class Mapper {
    private Mapper() {}

    public static Model811 of(Entity811 entity) {
        return new Model811(entity.getId(), entity.getField());
    }
}
