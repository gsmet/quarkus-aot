package fr.spacefox.perftests.quarkus.data.entity883;

import fr.spacefox.perftests.quarkus.core.service883.model.Model883;

final class Mapper {
    private Mapper() {}

    public static Model883 of(Entity883 entity) {
        return new Model883(entity.getId(), entity.getField());
    }
}
