package fr.spacefox.perftests.quarkus.data.entity349;

import fr.spacefox.perftests.quarkus.core.service349.model.Model349;

final class Mapper {
    private Mapper() {}

    public static Model349 of(Entity349 entity) {
        return new Model349(entity.getId(), entity.getField());
    }
}
