package fr.spacefox.perftests.quarkus.data.entity216;

import fr.spacefox.perftests.quarkus.core.service216.model.Model216;

final class Mapper {
    private Mapper() {}

    public static Model216 of(Entity216 entity) {
        return new Model216(entity.getId(), entity.getField());
    }
}
