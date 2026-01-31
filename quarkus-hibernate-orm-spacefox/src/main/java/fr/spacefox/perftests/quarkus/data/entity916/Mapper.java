package fr.spacefox.perftests.quarkus.data.entity916;

import fr.spacefox.perftests.quarkus.core.service916.model.Model916;

final class Mapper {
    private Mapper() {}

    public static Model916 of(Entity916 entity) {
        return new Model916(entity.getId(), entity.getField());
    }
}
