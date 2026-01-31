package fr.spacefox.perftests.quarkus.data.entity700;

import fr.spacefox.perftests.quarkus.core.service700.model.Model700;

final class Mapper {
    private Mapper() {}

    public static Model700 of(Entity700 entity) {
        return new Model700(entity.getId(), entity.getField());
    }
}
