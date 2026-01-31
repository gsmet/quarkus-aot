package fr.spacefox.perftests.quarkus.data.entity227;

import fr.spacefox.perftests.quarkus.core.service227.model.Model227;

final class Mapper {
    private Mapper() {}

    public static Model227 of(Entity227 entity) {
        return new Model227(entity.getId(), entity.getField());
    }
}
