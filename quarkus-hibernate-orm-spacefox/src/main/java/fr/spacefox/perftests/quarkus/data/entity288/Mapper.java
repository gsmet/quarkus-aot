package fr.spacefox.perftests.quarkus.data.entity288;

import fr.spacefox.perftests.quarkus.core.service288.model.Model288;

final class Mapper {
    private Mapper() {}

    public static Model288 of(Entity288 entity) {
        return new Model288(entity.getId(), entity.getField());
    }
}
