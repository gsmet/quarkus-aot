package fr.spacefox.perftests.quarkus.data.entity28;

import fr.spacefox.perftests.quarkus.core.service28.model.Model28;

final class Mapper {
    private Mapper() {}

    public static Model28 of(Entity28 entity) {
        return new Model28(entity.getId(), entity.getField());
    }
}
