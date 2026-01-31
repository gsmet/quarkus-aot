package fr.spacefox.perftests.quarkus.data.entity628;

import fr.spacefox.perftests.quarkus.core.service628.model.Model628;

final class Mapper {
    private Mapper() {}

    public static Model628 of(Entity628 entity) {
        return new Model628(entity.getId(), entity.getField());
    }
}
