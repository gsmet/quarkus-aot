package fr.spacefox.perftests.quarkus.data.entity282;

import fr.spacefox.perftests.quarkus.core.service282.model.Model282;

final class Mapper {
    private Mapper() {}

    public static Model282 of(Entity282 entity) {
        return new Model282(entity.getId(), entity.getField());
    }
}
