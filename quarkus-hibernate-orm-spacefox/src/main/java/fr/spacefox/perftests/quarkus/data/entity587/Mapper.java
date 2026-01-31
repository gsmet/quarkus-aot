package fr.spacefox.perftests.quarkus.data.entity587;

import fr.spacefox.perftests.quarkus.core.service587.model.Model587;

final class Mapper {
    private Mapper() {}

    public static Model587 of(Entity587 entity) {
        return new Model587(entity.getId(), entity.getField());
    }
}
