package fr.spacefox.perftests.quarkus.data.entity655;

import fr.spacefox.perftests.quarkus.core.service655.model.Model655;

final class Mapper {
    private Mapper() {}

    public static Model655 of(Entity655 entity) {
        return new Model655(entity.getId(), entity.getField());
    }
}
