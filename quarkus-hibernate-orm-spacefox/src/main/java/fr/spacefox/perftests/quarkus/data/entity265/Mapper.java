package fr.spacefox.perftests.quarkus.data.entity265;

import fr.spacefox.perftests.quarkus.core.service265.model.Model265;

final class Mapper {
    private Mapper() {}

    public static Model265 of(Entity265 entity) {
        return new Model265(entity.getId(), entity.getField());
    }
}
