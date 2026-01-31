package fr.spacefox.perftests.quarkus.data.entity547;

import fr.spacefox.perftests.quarkus.core.service547.model.Model547;

final class Mapper {
    private Mapper() {}

    public static Model547 of(Entity547 entity) {
        return new Model547(entity.getId(), entity.getField());
    }
}
