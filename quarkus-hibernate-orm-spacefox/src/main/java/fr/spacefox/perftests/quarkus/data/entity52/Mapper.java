package fr.spacefox.perftests.quarkus.data.entity52;

import fr.spacefox.perftests.quarkus.core.service52.model.Model52;

final class Mapper {
    private Mapper() {}

    public static Model52 of(Entity52 entity) {
        return new Model52(entity.getId(), entity.getField());
    }
}
