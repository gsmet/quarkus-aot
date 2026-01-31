package fr.spacefox.perftests.quarkus.data.entity338;

import fr.spacefox.perftests.quarkus.core.service338.model.Model338;

final class Mapper {
    private Mapper() {}

    public static Model338 of(Entity338 entity) {
        return new Model338(entity.getId(), entity.getField());
    }
}
