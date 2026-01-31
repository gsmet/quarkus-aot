package fr.spacefox.perftests.quarkus.data.entity388;

import fr.spacefox.perftests.quarkus.core.service388.model.Model388;

final class Mapper {
    private Mapper() {}

    public static Model388 of(Entity388 entity) {
        return new Model388(entity.getId(), entity.getField());
    }
}
