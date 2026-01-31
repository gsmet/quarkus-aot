package fr.spacefox.perftests.quarkus.data.entity3;

import fr.spacefox.perftests.quarkus.core.service3.model.Model3;

final class Mapper {
    private Mapper() {}

    public static Model3 of(Entity3 entity) {
        return new Model3(entity.getId(), entity.getField());
    }
}
