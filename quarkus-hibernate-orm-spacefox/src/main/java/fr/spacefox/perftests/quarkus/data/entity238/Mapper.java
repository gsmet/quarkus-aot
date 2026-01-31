package fr.spacefox.perftests.quarkus.data.entity238;

import fr.spacefox.perftests.quarkus.core.service238.model.Model238;

final class Mapper {
    private Mapper() {}

    public static Model238 of(Entity238 entity) {
        return new Model238(entity.getId(), entity.getField());
    }
}
