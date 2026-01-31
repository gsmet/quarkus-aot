package fr.spacefox.perftests.quarkus.data.entity61;

import fr.spacefox.perftests.quarkus.core.service61.model.Model61;

final class Mapper {
    private Mapper() {}

    public static Model61 of(Entity61 entity) {
        return new Model61(entity.getId(), entity.getField());
    }
}
