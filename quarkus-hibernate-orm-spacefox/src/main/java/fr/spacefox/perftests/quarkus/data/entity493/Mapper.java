package fr.spacefox.perftests.quarkus.data.entity493;

import fr.spacefox.perftests.quarkus.core.service493.model.Model493;

final class Mapper {
    private Mapper() {}

    public static Model493 of(Entity493 entity) {
        return new Model493(entity.getId(), entity.getField());
    }
}
