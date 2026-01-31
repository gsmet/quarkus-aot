package fr.spacefox.perftests.quarkus.data.entity965;

import fr.spacefox.perftests.quarkus.core.service965.model.Model965;

final class Mapper {
    private Mapper() {}

    public static Model965 of(Entity965 entity) {
        return new Model965(entity.getId(), entity.getField());
    }
}
