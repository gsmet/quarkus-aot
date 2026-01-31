package fr.spacefox.perftests.quarkus.data.entity287;

import fr.spacefox.perftests.quarkus.core.service287.model.Model287;

final class Mapper {
    private Mapper() {}

    public static Model287 of(Entity287 entity) {
        return new Model287(entity.getId(), entity.getField());
    }
}
