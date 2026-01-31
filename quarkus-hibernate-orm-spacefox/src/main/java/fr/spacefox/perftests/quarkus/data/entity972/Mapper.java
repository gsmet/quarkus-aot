package fr.spacefox.perftests.quarkus.data.entity972;

import fr.spacefox.perftests.quarkus.core.service972.model.Model972;

final class Mapper {
    private Mapper() {}

    public static Model972 of(Entity972 entity) {
        return new Model972(entity.getId(), entity.getField());
    }
}
