package fr.spacefox.perftests.quarkus.data.entity517;

import fr.spacefox.perftests.quarkus.core.service517.model.Model517;

final class Mapper {
    private Mapper() {}

    public static Model517 of(Entity517 entity) {
        return new Model517(entity.getId(), entity.getField());
    }
}
