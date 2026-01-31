package fr.spacefox.perftests.quarkus.data.entity529;

import fr.spacefox.perftests.quarkus.core.service529.model.Model529;

final class Mapper {
    private Mapper() {}

    public static Model529 of(Entity529 entity) {
        return new Model529(entity.getId(), entity.getField());
    }
}
