package fr.spacefox.perftests.quarkus.data.entity396;

import fr.spacefox.perftests.quarkus.core.service396.model.Model396;

final class Mapper {
    private Mapper() {}

    public static Model396 of(Entity396 entity) {
        return new Model396(entity.getId(), entity.getField());
    }
}
