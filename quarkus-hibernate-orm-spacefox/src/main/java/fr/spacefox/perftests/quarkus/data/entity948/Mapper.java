package fr.spacefox.perftests.quarkus.data.entity948;

import fr.spacefox.perftests.quarkus.core.service948.model.Model948;

final class Mapper {
    private Mapper() {}

    public static Model948 of(Entity948 entity) {
        return new Model948(entity.getId(), entity.getField());
    }
}
