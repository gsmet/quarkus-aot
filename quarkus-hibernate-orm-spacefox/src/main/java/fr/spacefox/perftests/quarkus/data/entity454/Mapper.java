package fr.spacefox.perftests.quarkus.data.entity454;

import fr.spacefox.perftests.quarkus.core.service454.model.Model454;

final class Mapper {
    private Mapper() {}

    public static Model454 of(Entity454 entity) {
        return new Model454(entity.getId(), entity.getField());
    }
}
