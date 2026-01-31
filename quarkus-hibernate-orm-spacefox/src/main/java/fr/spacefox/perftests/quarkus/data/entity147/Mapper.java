package fr.spacefox.perftests.quarkus.data.entity147;

import fr.spacefox.perftests.quarkus.core.service147.model.Model147;

final class Mapper {
    private Mapper() {}

    public static Model147 of(Entity147 entity) {
        return new Model147(entity.getId(), entity.getField());
    }
}
