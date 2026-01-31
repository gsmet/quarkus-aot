package fr.spacefox.perftests.quarkus.data.entity461;

import fr.spacefox.perftests.quarkus.core.service461.model.Model461;

final class Mapper {
    private Mapper() {}

    public static Model461 of(Entity461 entity) {
        return new Model461(entity.getId(), entity.getField());
    }
}
