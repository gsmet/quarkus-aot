package fr.spacefox.perftests.quarkus.data.entity194;

import fr.spacefox.perftests.quarkus.core.service194.model.Model194;

final class Mapper {
    private Mapper() {}

    public static Model194 of(Entity194 entity) {
        return new Model194(entity.getId(), entity.getField());
    }
}
