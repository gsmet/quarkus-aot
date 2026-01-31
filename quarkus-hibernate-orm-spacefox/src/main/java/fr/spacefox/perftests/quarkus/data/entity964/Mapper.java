package fr.spacefox.perftests.quarkus.data.entity964;

import fr.spacefox.perftests.quarkus.core.service964.model.Model964;

final class Mapper {
    private Mapper() {}

    public static Model964 of(Entity964 entity) {
        return new Model964(entity.getId(), entity.getField());
    }
}
