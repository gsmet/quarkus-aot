package fr.spacefox.perftests.quarkus.data.entity473;

import fr.spacefox.perftests.quarkus.core.service473.model.Model473;

final class Mapper {
    private Mapper() {}

    public static Model473 of(Entity473 entity) {
        return new Model473(entity.getId(), entity.getField());
    }
}
