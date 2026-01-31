package fr.spacefox.perftests.quarkus.data.entity730;

import fr.spacefox.perftests.quarkus.core.service730.model.Model730;

final class Mapper {
    private Mapper() {}

    public static Model730 of(Entity730 entity) {
        return new Model730(entity.getId(), entity.getField());
    }
}
