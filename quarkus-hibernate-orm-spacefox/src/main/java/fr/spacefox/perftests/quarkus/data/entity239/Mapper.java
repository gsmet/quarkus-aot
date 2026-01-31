package fr.spacefox.perftests.quarkus.data.entity239;

import fr.spacefox.perftests.quarkus.core.service239.model.Model239;

final class Mapper {
    private Mapper() {}

    public static Model239 of(Entity239 entity) {
        return new Model239(entity.getId(), entity.getField());
    }
}
