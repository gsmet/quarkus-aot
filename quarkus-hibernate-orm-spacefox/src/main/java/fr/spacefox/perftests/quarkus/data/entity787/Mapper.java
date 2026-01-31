package fr.spacefox.perftests.quarkus.data.entity787;

import fr.spacefox.perftests.quarkus.core.service787.model.Model787;

final class Mapper {
    private Mapper() {}

    public static Model787 of(Entity787 entity) {
        return new Model787(entity.getId(), entity.getField());
    }
}
