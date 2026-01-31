package fr.spacefox.perftests.quarkus.data.entity653;

import fr.spacefox.perftests.quarkus.core.service653.model.Model653;

final class Mapper {
    private Mapper() {}

    public static Model653 of(Entity653 entity) {
        return new Model653(entity.getId(), entity.getField());
    }
}
