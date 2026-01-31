package fr.spacefox.perftests.quarkus.data.entity765;

import fr.spacefox.perftests.quarkus.core.service765.model.Model765;

final class Mapper {
    private Mapper() {}

    public static Model765 of(Entity765 entity) {
        return new Model765(entity.getId(), entity.getField());
    }
}
