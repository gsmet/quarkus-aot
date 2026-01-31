package fr.spacefox.perftests.quarkus.data.entity666;

import fr.spacefox.perftests.quarkus.core.service666.model.Model666;

final class Mapper {
    private Mapper() {}

    public static Model666 of(Entity666 entity) {
        return new Model666(entity.getId(), entity.getField());
    }
}
