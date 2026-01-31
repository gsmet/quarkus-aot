package fr.spacefox.perftests.quarkus.data.entity146;

import fr.spacefox.perftests.quarkus.core.service146.model.Model146;

final class Mapper {
    private Mapper() {}

    public static Model146 of(Entity146 entity) {
        return new Model146(entity.getId(), entity.getField());
    }
}
