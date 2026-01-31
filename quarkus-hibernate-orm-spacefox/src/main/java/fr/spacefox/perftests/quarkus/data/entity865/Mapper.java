package fr.spacefox.perftests.quarkus.data.entity865;

import fr.spacefox.perftests.quarkus.core.service865.model.Model865;

final class Mapper {
    private Mapper() {}

    public static Model865 of(Entity865 entity) {
        return new Model865(entity.getId(), entity.getField());
    }
}
