package fr.spacefox.perftests.quarkus.data.entity661;

import fr.spacefox.perftests.quarkus.core.service661.model.Model661;

final class Mapper {
    private Mapper() {}

    public static Model661 of(Entity661 entity) {
        return new Model661(entity.getId(), entity.getField());
    }
}
