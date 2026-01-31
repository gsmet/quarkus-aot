package fr.spacefox.perftests.quarkus.data.entity258;

import fr.spacefox.perftests.quarkus.core.service258.model.Model258;

final class Mapper {
    private Mapper() {}

    public static Model258 of(Entity258 entity) {
        return new Model258(entity.getId(), entity.getField());
    }
}
