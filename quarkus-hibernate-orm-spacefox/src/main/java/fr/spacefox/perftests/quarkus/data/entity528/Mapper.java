package fr.spacefox.perftests.quarkus.data.entity528;

import fr.spacefox.perftests.quarkus.core.service528.model.Model528;

final class Mapper {
    private Mapper() {}

    public static Model528 of(Entity528 entity) {
        return new Model528(entity.getId(), entity.getField());
    }
}
