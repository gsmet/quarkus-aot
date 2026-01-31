package fr.spacefox.perftests.quarkus.data.entity532;

import fr.spacefox.perftests.quarkus.core.service532.model.Model532;

final class Mapper {
    private Mapper() {}

    public static Model532 of(Entity532 entity) {
        return new Model532(entity.getId(), entity.getField());
    }
}
