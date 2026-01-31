package fr.spacefox.perftests.quarkus.data.entity942;

import fr.spacefox.perftests.quarkus.core.service942.model.Model942;

final class Mapper {
    private Mapper() {}

    public static Model942 of(Entity942 entity) {
        return new Model942(entity.getId(), entity.getField());
    }
}
