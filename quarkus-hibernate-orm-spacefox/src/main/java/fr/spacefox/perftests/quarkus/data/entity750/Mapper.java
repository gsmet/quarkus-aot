package fr.spacefox.perftests.quarkus.data.entity750;

import fr.spacefox.perftests.quarkus.core.service750.model.Model750;

final class Mapper {
    private Mapper() {}

    public static Model750 of(Entity750 entity) {
        return new Model750(entity.getId(), entity.getField());
    }
}
