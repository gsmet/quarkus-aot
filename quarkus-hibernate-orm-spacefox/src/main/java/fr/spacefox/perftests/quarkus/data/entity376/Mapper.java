package fr.spacefox.perftests.quarkus.data.entity376;

import fr.spacefox.perftests.quarkus.core.service376.model.Model376;

final class Mapper {
    private Mapper() {}

    public static Model376 of(Entity376 entity) {
        return new Model376(entity.getId(), entity.getField());
    }
}
