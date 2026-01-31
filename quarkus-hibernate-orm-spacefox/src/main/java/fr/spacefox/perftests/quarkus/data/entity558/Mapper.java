package fr.spacefox.perftests.quarkus.data.entity558;

import fr.spacefox.perftests.quarkus.core.service558.model.Model558;

final class Mapper {
    private Mapper() {}

    public static Model558 of(Entity558 entity) {
        return new Model558(entity.getId(), entity.getField());
    }
}
