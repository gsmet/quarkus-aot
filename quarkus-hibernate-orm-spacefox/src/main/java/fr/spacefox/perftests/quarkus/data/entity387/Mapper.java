package fr.spacefox.perftests.quarkus.data.entity387;

import fr.spacefox.perftests.quarkus.core.service387.model.Model387;

final class Mapper {
    private Mapper() {}

    public static Model387 of(Entity387 entity) {
        return new Model387(entity.getId(), entity.getField());
    }
}
