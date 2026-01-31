package fr.spacefox.perftests.quarkus.data.entity625;

import fr.spacefox.perftests.quarkus.core.service625.model.Model625;

final class Mapper {
    private Mapper() {}

    public static Model625 of(Entity625 entity) {
        return new Model625(entity.getId(), entity.getField());
    }
}
