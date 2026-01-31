package fr.spacefox.perftests.quarkus.data.entity280;

import fr.spacefox.perftests.quarkus.core.service280.model.Model280;

final class Mapper {
    private Mapper() {}

    public static Model280 of(Entity280 entity) {
        return new Model280(entity.getId(), entity.getField());
    }
}
