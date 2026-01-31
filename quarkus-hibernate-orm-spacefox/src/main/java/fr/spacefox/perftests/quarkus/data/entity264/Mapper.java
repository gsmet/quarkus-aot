package fr.spacefox.perftests.quarkus.data.entity264;

import fr.spacefox.perftests.quarkus.core.service264.model.Model264;

final class Mapper {
    private Mapper() {}

    public static Model264 of(Entity264 entity) {
        return new Model264(entity.getId(), entity.getField());
    }
}
