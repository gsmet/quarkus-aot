package fr.spacefox.perftests.quarkus.data.entity406;

import fr.spacefox.perftests.quarkus.core.service406.model.Model406;

final class Mapper {
    private Mapper() {}

    public static Model406 of(Entity406 entity) {
        return new Model406(entity.getId(), entity.getField());
    }
}
