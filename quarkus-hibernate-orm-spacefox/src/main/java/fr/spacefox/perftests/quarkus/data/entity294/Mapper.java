package fr.spacefox.perftests.quarkus.data.entity294;

import fr.spacefox.perftests.quarkus.core.service294.model.Model294;

final class Mapper {
    private Mapper() {}

    public static Model294 of(Entity294 entity) {
        return new Model294(entity.getId(), entity.getField());
    }
}
