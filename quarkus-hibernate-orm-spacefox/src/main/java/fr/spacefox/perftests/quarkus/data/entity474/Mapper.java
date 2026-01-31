package fr.spacefox.perftests.quarkus.data.entity474;

import fr.spacefox.perftests.quarkus.core.service474.model.Model474;

final class Mapper {
    private Mapper() {}

    public static Model474 of(Entity474 entity) {
        return new Model474(entity.getId(), entity.getField());
    }
}
