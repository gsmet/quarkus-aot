package fr.spacefox.perftests.quarkus.data.entity469;

import fr.spacefox.perftests.quarkus.core.service469.model.Model469;

final class Mapper {
    private Mapper() {}

    public static Model469 of(Entity469 entity) {
        return new Model469(entity.getId(), entity.getField());
    }
}
