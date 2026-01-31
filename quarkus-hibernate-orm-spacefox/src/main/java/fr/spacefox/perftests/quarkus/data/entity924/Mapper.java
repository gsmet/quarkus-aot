package fr.spacefox.perftests.quarkus.data.entity924;

import fr.spacefox.perftests.quarkus.core.service924.model.Model924;

final class Mapper {
    private Mapper() {}

    public static Model924 of(Entity924 entity) {
        return new Model924(entity.getId(), entity.getField());
    }
}
