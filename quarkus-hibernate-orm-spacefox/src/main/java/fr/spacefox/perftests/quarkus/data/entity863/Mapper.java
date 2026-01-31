package fr.spacefox.perftests.quarkus.data.entity863;

import fr.spacefox.perftests.quarkus.core.service863.model.Model863;

final class Mapper {
    private Mapper() {}

    public static Model863 of(Entity863 entity) {
        return new Model863(entity.getId(), entity.getField());
    }
}
