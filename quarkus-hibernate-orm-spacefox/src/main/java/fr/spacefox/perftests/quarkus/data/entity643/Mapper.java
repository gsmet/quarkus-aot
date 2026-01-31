package fr.spacefox.perftests.quarkus.data.entity643;

import fr.spacefox.perftests.quarkus.core.service643.model.Model643;

final class Mapper {
    private Mapper() {}

    public static Model643 of(Entity643 entity) {
        return new Model643(entity.getId(), entity.getField());
    }
}
