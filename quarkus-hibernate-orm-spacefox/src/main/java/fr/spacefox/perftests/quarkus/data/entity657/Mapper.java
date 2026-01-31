package fr.spacefox.perftests.quarkus.data.entity657;

import fr.spacefox.perftests.quarkus.core.service657.model.Model657;

final class Mapper {
    private Mapper() {}

    public static Model657 of(Entity657 entity) {
        return new Model657(entity.getId(), entity.getField());
    }
}
