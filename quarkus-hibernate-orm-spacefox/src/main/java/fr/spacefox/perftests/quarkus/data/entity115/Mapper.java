package fr.spacefox.perftests.quarkus.data.entity115;

import fr.spacefox.perftests.quarkus.core.service115.model.Model115;

final class Mapper {
    private Mapper() {}

    public static Model115 of(Entity115 entity) {
        return new Model115(entity.getId(), entity.getField());
    }
}
