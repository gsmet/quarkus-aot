package fr.spacefox.perftests.quarkus.data.entity925;

import fr.spacefox.perftests.quarkus.core.service925.model.Model925;

final class Mapper {
    private Mapper() {}

    public static Model925 of(Entity925 entity) {
        return new Model925(entity.getId(), entity.getField());
    }
}
