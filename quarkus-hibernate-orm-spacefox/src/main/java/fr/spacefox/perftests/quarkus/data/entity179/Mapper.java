package fr.spacefox.perftests.quarkus.data.entity179;

import fr.spacefox.perftests.quarkus.core.service179.model.Model179;

final class Mapper {
    private Mapper() {}

    public static Model179 of(Entity179 entity) {
        return new Model179(entity.getId(), entity.getField());
    }
}
