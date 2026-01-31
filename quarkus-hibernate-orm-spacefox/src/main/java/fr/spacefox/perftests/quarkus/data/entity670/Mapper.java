package fr.spacefox.perftests.quarkus.data.entity670;

import fr.spacefox.perftests.quarkus.core.service670.model.Model670;

final class Mapper {
    private Mapper() {}

    public static Model670 of(Entity670 entity) {
        return new Model670(entity.getId(), entity.getField());
    }
}
