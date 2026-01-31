package fr.spacefox.perftests.quarkus.data.entity62;

import fr.spacefox.perftests.quarkus.core.service62.model.Model62;

final class Mapper {
    private Mapper() {}

    public static Model62 of(Entity62 entity) {
        return new Model62(entity.getId(), entity.getField());
    }
}
