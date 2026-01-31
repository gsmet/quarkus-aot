package fr.spacefox.perftests.quarkus.data.entity895;

import fr.spacefox.perftests.quarkus.core.service895.model.Model895;

final class Mapper {
    private Mapper() {}

    public static Model895 of(Entity895 entity) {
        return new Model895(entity.getId(), entity.getField());
    }
}
