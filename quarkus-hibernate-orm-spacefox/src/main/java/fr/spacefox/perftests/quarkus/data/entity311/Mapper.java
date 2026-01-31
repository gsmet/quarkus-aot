package fr.spacefox.perftests.quarkus.data.entity311;

import fr.spacefox.perftests.quarkus.core.service311.model.Model311;

final class Mapper {
    private Mapper() {}

    public static Model311 of(Entity311 entity) {
        return new Model311(entity.getId(), entity.getField());
    }
}
