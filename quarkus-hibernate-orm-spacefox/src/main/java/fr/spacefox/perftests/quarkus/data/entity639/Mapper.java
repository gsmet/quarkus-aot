package fr.spacefox.perftests.quarkus.data.entity639;

import fr.spacefox.perftests.quarkus.core.service639.model.Model639;

final class Mapper {
    private Mapper() {}

    public static Model639 of(Entity639 entity) {
        return new Model639(entity.getId(), entity.getField());
    }
}
