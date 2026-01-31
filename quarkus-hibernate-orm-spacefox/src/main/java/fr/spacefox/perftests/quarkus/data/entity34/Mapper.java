package fr.spacefox.perftests.quarkus.data.entity34;

import fr.spacefox.perftests.quarkus.core.service34.model.Model34;

final class Mapper {
    private Mapper() {}

    public static Model34 of(Entity34 entity) {
        return new Model34(entity.getId(), entity.getField());
    }
}
