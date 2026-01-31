package fr.spacefox.perftests.quarkus.data.entity544;

import fr.spacefox.perftests.quarkus.core.service544.model.Model544;

final class Mapper {
    private Mapper() {}

    public static Model544 of(Entity544 entity) {
        return new Model544(entity.getId(), entity.getField());
    }
}
