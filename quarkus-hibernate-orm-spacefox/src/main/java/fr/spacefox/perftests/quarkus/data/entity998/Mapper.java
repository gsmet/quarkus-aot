package fr.spacefox.perftests.quarkus.data.entity998;

import fr.spacefox.perftests.quarkus.core.service998.model.Model998;

final class Mapper {
    private Mapper() {}

    public static Model998 of(Entity998 entity) {
        return new Model998(entity.getId(), entity.getField());
    }
}
