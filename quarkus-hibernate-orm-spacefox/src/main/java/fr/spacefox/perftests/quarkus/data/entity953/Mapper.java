package fr.spacefox.perftests.quarkus.data.entity953;

import fr.spacefox.perftests.quarkus.core.service953.model.Model953;

final class Mapper {
    private Mapper() {}

    public static Model953 of(Entity953 entity) {
        return new Model953(entity.getId(), entity.getField());
    }
}
