package fr.spacefox.perftests.quarkus.data.entity584;

import fr.spacefox.perftests.quarkus.core.service584.model.Model584;

final class Mapper {
    private Mapper() {}

    public static Model584 of(Entity584 entity) {
        return new Model584(entity.getId(), entity.getField());
    }
}
