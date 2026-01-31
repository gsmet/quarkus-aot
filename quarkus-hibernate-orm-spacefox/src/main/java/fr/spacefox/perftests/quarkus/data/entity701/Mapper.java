package fr.spacefox.perftests.quarkus.data.entity701;

import fr.spacefox.perftests.quarkus.core.service701.model.Model701;

final class Mapper {
    private Mapper() {}

    public static Model701 of(Entity701 entity) {
        return new Model701(entity.getId(), entity.getField());
    }
}
