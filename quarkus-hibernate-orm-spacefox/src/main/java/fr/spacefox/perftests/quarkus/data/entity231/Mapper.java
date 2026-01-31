package fr.spacefox.perftests.quarkus.data.entity231;

import fr.spacefox.perftests.quarkus.core.service231.model.Model231;

final class Mapper {
    private Mapper() {}

    public static Model231 of(Entity231 entity) {
        return new Model231(entity.getId(), entity.getField());
    }
}
