package fr.spacefox.perftests.quarkus.data.entity882;

import fr.spacefox.perftests.quarkus.core.service882.model.Model882;

final class Mapper {
    private Mapper() {}

    public static Model882 of(Entity882 entity) {
        return new Model882(entity.getId(), entity.getField());
    }
}
