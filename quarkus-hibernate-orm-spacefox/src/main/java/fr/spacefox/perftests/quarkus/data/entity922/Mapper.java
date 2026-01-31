package fr.spacefox.perftests.quarkus.data.entity922;

import fr.spacefox.perftests.quarkus.core.service922.model.Model922;

final class Mapper {
    private Mapper() {}

    public static Model922 of(Entity922 entity) {
        return new Model922(entity.getId(), entity.getField());
    }
}
