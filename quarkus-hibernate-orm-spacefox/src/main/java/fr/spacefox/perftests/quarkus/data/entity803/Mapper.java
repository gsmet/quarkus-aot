package fr.spacefox.perftests.quarkus.data.entity803;

import fr.spacefox.perftests.quarkus.core.service803.model.Model803;

final class Mapper {
    private Mapper() {}

    public static Model803 of(Entity803 entity) {
        return new Model803(entity.getId(), entity.getField());
    }
}
