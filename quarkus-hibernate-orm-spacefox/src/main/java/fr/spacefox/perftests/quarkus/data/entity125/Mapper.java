package fr.spacefox.perftests.quarkus.data.entity125;

import fr.spacefox.perftests.quarkus.core.service125.model.Model125;

final class Mapper {
    private Mapper() {}

    public static Model125 of(Entity125 entity) {
        return new Model125(entity.getId(), entity.getField());
    }
}
