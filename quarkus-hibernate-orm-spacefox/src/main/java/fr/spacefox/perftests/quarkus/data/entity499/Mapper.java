package fr.spacefox.perftests.quarkus.data.entity499;

import fr.spacefox.perftests.quarkus.core.service499.model.Model499;

final class Mapper {
    private Mapper() {}

    public static Model499 of(Entity499 entity) {
        return new Model499(entity.getId(), entity.getField());
    }
}
