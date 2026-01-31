package fr.spacefox.perftests.quarkus.data.entity438;

import fr.spacefox.perftests.quarkus.core.service438.model.Model438;

final class Mapper {
    private Mapper() {}

    public static Model438 of(Entity438 entity) {
        return new Model438(entity.getId(), entity.getField());
    }
}
