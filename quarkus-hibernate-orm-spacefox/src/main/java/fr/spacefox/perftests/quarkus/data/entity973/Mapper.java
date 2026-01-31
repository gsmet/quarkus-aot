package fr.spacefox.perftests.quarkus.data.entity973;

import fr.spacefox.perftests.quarkus.core.service973.model.Model973;

final class Mapper {
    private Mapper() {}

    public static Model973 of(Entity973 entity) {
        return new Model973(entity.getId(), entity.getField());
    }
}
