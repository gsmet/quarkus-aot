package fr.spacefox.perftests.quarkus.data.entity243;

import fr.spacefox.perftests.quarkus.core.service243.model.Model243;

final class Mapper {
    private Mapper() {}

    public static Model243 of(Entity243 entity) {
        return new Model243(entity.getId(), entity.getField());
    }
}
