package fr.spacefox.perftests.quarkus.data.entity801;

import fr.spacefox.perftests.quarkus.core.service801.model.Model801;

final class Mapper {
    private Mapper() {}

    public static Model801 of(Entity801 entity) {
        return new Model801(entity.getId(), entity.getField());
    }
}
