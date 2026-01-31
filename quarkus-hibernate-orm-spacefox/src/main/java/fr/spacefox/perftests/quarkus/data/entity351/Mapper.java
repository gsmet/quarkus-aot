package fr.spacefox.perftests.quarkus.data.entity351;

import fr.spacefox.perftests.quarkus.core.service351.model.Model351;

final class Mapper {
    private Mapper() {}

    public static Model351 of(Entity351 entity) {
        return new Model351(entity.getId(), entity.getField());
    }
}
