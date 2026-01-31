package fr.spacefox.perftests.quarkus.data.entity110;

import fr.spacefox.perftests.quarkus.core.service110.model.Model110;

final class Mapper {
    private Mapper() {}

    public static Model110 of(Entity110 entity) {
        return new Model110(entity.getId(), entity.getField());
    }
}
