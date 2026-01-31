package fr.spacefox.perftests.quarkus.data.entity132;

import fr.spacefox.perftests.quarkus.core.service132.model.Model132;

final class Mapper {
    private Mapper() {}

    public static Model132 of(Entity132 entity) {
        return new Model132(entity.getId(), entity.getField());
    }
}
