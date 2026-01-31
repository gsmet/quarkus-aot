package fr.spacefox.perftests.quarkus.data.entity497;

import fr.spacefox.perftests.quarkus.core.service497.model.Model497;

final class Mapper {
    private Mapper() {}

    public static Model497 of(Entity497 entity) {
        return new Model497(entity.getId(), entity.getField());
    }
}
