package fr.spacefox.perftests.quarkus.data.entity96;

import fr.spacefox.perftests.quarkus.core.service96.model.Model96;

final class Mapper {
    private Mapper() {}

    public static Model96 of(Entity96 entity) {
        return new Model96(entity.getId(), entity.getField());
    }
}
