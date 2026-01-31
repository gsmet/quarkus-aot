package fr.spacefox.perftests.quarkus.data.entity462;

import fr.spacefox.perftests.quarkus.core.service462.model.Model462;

final class Mapper {
    private Mapper() {}

    public static Model462 of(Entity462 entity) {
        return new Model462(entity.getId(), entity.getField());
    }
}
