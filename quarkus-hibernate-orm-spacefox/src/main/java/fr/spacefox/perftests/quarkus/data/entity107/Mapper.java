package fr.spacefox.perftests.quarkus.data.entity107;

import fr.spacefox.perftests.quarkus.core.service107.model.Model107;

final class Mapper {
    private Mapper() {}

    public static Model107 of(Entity107 entity) {
        return new Model107(entity.getId(), entity.getField());
    }
}
