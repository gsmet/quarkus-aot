package fr.spacefox.perftests.quarkus.data.entity993;

import fr.spacefox.perftests.quarkus.core.service993.model.Model993;

final class Mapper {
    private Mapper() {}

    public static Model993 of(Entity993 entity) {
        return new Model993(entity.getId(), entity.getField());
    }
}
