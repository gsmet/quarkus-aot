package fr.spacefox.perftests.quarkus.data.entity621;

import fr.spacefox.perftests.quarkus.core.service621.model.Model621;

final class Mapper {
    private Mapper() {}

    public static Model621 of(Entity621 entity) {
        return new Model621(entity.getId(), entity.getField());
    }
}
