package fr.spacefox.perftests.quarkus.data.entity30;

import fr.spacefox.perftests.quarkus.core.service30.model.Model30;

final class Mapper {
    private Mapper() {}

    public static Model30 of(Entity30 entity) {
        return new Model30(entity.getId(), entity.getField());
    }
}
