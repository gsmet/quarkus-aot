package fr.spacefox.perftests.quarkus.data.entity407;

import fr.spacefox.perftests.quarkus.core.service407.model.Model407;

final class Mapper {
    private Mapper() {}

    public static Model407 of(Entity407 entity) {
        return new Model407(entity.getId(), entity.getField());
    }
}
