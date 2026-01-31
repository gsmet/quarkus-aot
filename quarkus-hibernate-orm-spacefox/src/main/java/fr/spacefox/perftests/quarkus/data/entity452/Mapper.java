package fr.spacefox.perftests.quarkus.data.entity452;

import fr.spacefox.perftests.quarkus.core.service452.model.Model452;

final class Mapper {
    private Mapper() {}

    public static Model452 of(Entity452 entity) {
        return new Model452(entity.getId(), entity.getField());
    }
}
