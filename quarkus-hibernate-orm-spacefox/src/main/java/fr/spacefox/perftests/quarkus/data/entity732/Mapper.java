package fr.spacefox.perftests.quarkus.data.entity732;

import fr.spacefox.perftests.quarkus.core.service732.model.Model732;

final class Mapper {
    private Mapper() {}

    public static Model732 of(Entity732 entity) {
        return new Model732(entity.getId(), entity.getField());
    }
}
