package fr.spacefox.perftests.quarkus.data.entity204;

import fr.spacefox.perftests.quarkus.core.service204.model.Model204;

final class Mapper {
    private Mapper() {}

    public static Model204 of(Entity204 entity) {
        return new Model204(entity.getId(), entity.getField());
    }
}
