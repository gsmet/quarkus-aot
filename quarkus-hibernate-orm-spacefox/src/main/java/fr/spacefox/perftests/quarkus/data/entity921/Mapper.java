package fr.spacefox.perftests.quarkus.data.entity921;

import fr.spacefox.perftests.quarkus.core.service921.model.Model921;

final class Mapper {
    private Mapper() {}

    public static Model921 of(Entity921 entity) {
        return new Model921(entity.getId(), entity.getField());
    }
}
