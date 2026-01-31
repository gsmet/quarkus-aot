package fr.spacefox.perftests.quarkus.data.entity755;

import fr.spacefox.perftests.quarkus.core.service755.model.Model755;

final class Mapper {
    private Mapper() {}

    public static Model755 of(Entity755 entity) {
        return new Model755(entity.getId(), entity.getField());
    }
}
