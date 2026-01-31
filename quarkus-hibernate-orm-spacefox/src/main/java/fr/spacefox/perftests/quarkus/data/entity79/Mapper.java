package fr.spacefox.perftests.quarkus.data.entity79;

import fr.spacefox.perftests.quarkus.core.service79.model.Model79;

final class Mapper {
    private Mapper() {}

    public static Model79 of(Entity79 entity) {
        return new Model79(entity.getId(), entity.getField());
    }
}
