package fr.spacefox.perftests.quarkus.data.entity328;

import fr.spacefox.perftests.quarkus.core.service328.model.Model328;

final class Mapper {
    private Mapper() {}

    public static Model328 of(Entity328 entity) {
        return new Model328(entity.getId(), entity.getField());
    }
}
