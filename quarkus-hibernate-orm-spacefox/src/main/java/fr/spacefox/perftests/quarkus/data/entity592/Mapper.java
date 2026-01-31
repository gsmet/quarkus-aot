package fr.spacefox.perftests.quarkus.data.entity592;

import fr.spacefox.perftests.quarkus.core.service592.model.Model592;

final class Mapper {
    private Mapper() {}

    public static Model592 of(Entity592 entity) {
        return new Model592(entity.getId(), entity.getField());
    }
}
