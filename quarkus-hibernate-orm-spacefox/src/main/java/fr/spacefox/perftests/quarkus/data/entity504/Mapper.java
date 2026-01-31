package fr.spacefox.perftests.quarkus.data.entity504;

import fr.spacefox.perftests.quarkus.core.service504.model.Model504;

final class Mapper {
    private Mapper() {}

    public static Model504 of(Entity504 entity) {
        return new Model504(entity.getId(), entity.getField());
    }
}
