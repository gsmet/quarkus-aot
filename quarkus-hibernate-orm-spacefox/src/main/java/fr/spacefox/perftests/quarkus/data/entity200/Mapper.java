package fr.spacefox.perftests.quarkus.data.entity200;

import fr.spacefox.perftests.quarkus.core.service200.model.Model200;

final class Mapper {
    private Mapper() {}

    public static Model200 of(Entity200 entity) {
        return new Model200(entity.getId(), entity.getField());
    }
}
