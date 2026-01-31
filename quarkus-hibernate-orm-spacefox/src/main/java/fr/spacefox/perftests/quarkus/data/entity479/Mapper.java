package fr.spacefox.perftests.quarkus.data.entity479;

import fr.spacefox.perftests.quarkus.core.service479.model.Model479;

final class Mapper {
    private Mapper() {}

    public static Model479 of(Entity479 entity) {
        return new Model479(entity.getId(), entity.getField());
    }
}
