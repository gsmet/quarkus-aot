package fr.spacefox.perftests.quarkus.data.entity827;

import fr.spacefox.perftests.quarkus.core.service827.model.Model827;

final class Mapper {
    private Mapper() {}

    public static Model827 of(Entity827 entity) {
        return new Model827(entity.getId(), entity.getField());
    }
}
