package fr.spacefox.perftests.quarkus.data.entity635;

import fr.spacefox.perftests.quarkus.core.service635.model.Model635;

final class Mapper {
    private Mapper() {}

    public static Model635 of(Entity635 entity) {
        return new Model635(entity.getId(), entity.getField());
    }
}
