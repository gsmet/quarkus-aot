package fr.spacefox.perftests.quarkus.data.entity196;

import fr.spacefox.perftests.quarkus.core.service196.model.Model196;

final class Mapper {
    private Mapper() {}

    public static Model196 of(Entity196 entity) {
        return new Model196(entity.getId(), entity.getField());
    }
}
