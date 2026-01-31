package fr.spacefox.perftests.quarkus.data.entity320;

import fr.spacefox.perftests.quarkus.core.service320.model.Model320;

final class Mapper {
    private Mapper() {}

    public static Model320 of(Entity320 entity) {
        return new Model320(entity.getId(), entity.getField());
    }
}
