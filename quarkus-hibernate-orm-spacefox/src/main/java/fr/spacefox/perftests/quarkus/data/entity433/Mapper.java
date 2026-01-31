package fr.spacefox.perftests.quarkus.data.entity433;

import fr.spacefox.perftests.quarkus.core.service433.model.Model433;

final class Mapper {
    private Mapper() {}

    public static Model433 of(Entity433 entity) {
        return new Model433(entity.getId(), entity.getField());
    }
}
