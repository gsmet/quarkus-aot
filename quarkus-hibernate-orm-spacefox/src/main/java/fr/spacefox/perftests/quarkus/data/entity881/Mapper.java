package fr.spacefox.perftests.quarkus.data.entity881;

import fr.spacefox.perftests.quarkus.core.service881.model.Model881;

final class Mapper {
    private Mapper() {}

    public static Model881 of(Entity881 entity) {
        return new Model881(entity.getId(), entity.getField());
    }
}
