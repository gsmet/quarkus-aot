package fr.spacefox.perftests.quarkus.data.entity729;

import fr.spacefox.perftests.quarkus.core.service729.model.Model729;

final class Mapper {
    private Mapper() {}

    public static Model729 of(Entity729 entity) {
        return new Model729(entity.getId(), entity.getField());
    }
}
