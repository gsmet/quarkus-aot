package fr.spacefox.perftests.quarkus.data.entity962;

import fr.spacefox.perftests.quarkus.core.service962.model.Model962;

final class Mapper {
    private Mapper() {}

    public static Model962 of(Entity962 entity) {
        return new Model962(entity.getId(), entity.getField());
    }
}
