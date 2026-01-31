package fr.spacefox.perftests.quarkus.data.entity38;

import fr.spacefox.perftests.quarkus.core.service38.model.Model38;

final class Mapper {
    private Mapper() {}

    public static Model38 of(Entity38 entity) {
        return new Model38(entity.getId(), entity.getField());
    }
}
