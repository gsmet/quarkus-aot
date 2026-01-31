package fr.spacefox.perftests.quarkus.data.entity911;

import fr.spacefox.perftests.quarkus.core.service911.model.Model911;

final class Mapper {
    private Mapper() {}

    public static Model911 of(Entity911 entity) {
        return new Model911(entity.getId(), entity.getField());
    }
}
