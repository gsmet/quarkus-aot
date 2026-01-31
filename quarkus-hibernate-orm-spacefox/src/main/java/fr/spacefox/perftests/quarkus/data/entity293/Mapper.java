package fr.spacefox.perftests.quarkus.data.entity293;

import fr.spacefox.perftests.quarkus.core.service293.model.Model293;

final class Mapper {
    private Mapper() {}

    public static Model293 of(Entity293 entity) {
        return new Model293(entity.getId(), entity.getField());
    }
}
