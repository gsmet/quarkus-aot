package fr.spacefox.perftests.quarkus.data.entity538;

import fr.spacefox.perftests.quarkus.core.service538.model.Model538;

final class Mapper {
    private Mapper() {}

    public static Model538 of(Entity538 entity) {
        return new Model538(entity.getId(), entity.getField());
    }
}
