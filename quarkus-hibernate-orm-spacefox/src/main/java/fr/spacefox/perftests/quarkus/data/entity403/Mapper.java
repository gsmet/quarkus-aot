package fr.spacefox.perftests.quarkus.data.entity403;

import fr.spacefox.perftests.quarkus.core.service403.model.Model403;

final class Mapper {
    private Mapper() {}

    public static Model403 of(Entity403 entity) {
        return new Model403(entity.getId(), entity.getField());
    }
}
