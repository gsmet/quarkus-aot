package fr.spacefox.perftests.quarkus.data.entity416;

import fr.spacefox.perftests.quarkus.core.service416.model.Model416;

final class Mapper {
    private Mapper() {}

    public static Model416 of(Entity416 entity) {
        return new Model416(entity.getId(), entity.getField());
    }
}
