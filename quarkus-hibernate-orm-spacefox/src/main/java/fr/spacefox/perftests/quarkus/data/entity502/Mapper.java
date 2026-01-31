package fr.spacefox.perftests.quarkus.data.entity502;

import fr.spacefox.perftests.quarkus.core.service502.model.Model502;

final class Mapper {
    private Mapper() {}

    public static Model502 of(Entity502 entity) {
        return new Model502(entity.getId(), entity.getField());
    }
}
