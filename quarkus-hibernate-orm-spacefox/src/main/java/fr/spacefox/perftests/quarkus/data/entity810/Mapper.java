package fr.spacefox.perftests.quarkus.data.entity810;

import fr.spacefox.perftests.quarkus.core.service810.model.Model810;

final class Mapper {
    private Mapper() {}

    public static Model810 of(Entity810 entity) {
        return new Model810(entity.getId(), entity.getField());
    }
}
