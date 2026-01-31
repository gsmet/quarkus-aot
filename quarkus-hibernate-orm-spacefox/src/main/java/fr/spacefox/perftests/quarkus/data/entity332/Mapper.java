package fr.spacefox.perftests.quarkus.data.entity332;

import fr.spacefox.perftests.quarkus.core.service332.model.Model332;

final class Mapper {
    private Mapper() {}

    public static Model332 of(Entity332 entity) {
        return new Model332(entity.getId(), entity.getField());
    }
}
