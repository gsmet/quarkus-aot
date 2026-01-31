package fr.spacefox.perftests.quarkus.data.entity340;

import fr.spacefox.perftests.quarkus.core.service340.model.Model340;

final class Mapper {
    private Mapper() {}

    public static Model340 of(Entity340 entity) {
        return new Model340(entity.getId(), entity.getField());
    }
}
