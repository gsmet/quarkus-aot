package fr.spacefox.perftests.quarkus.data.entity445;

import fr.spacefox.perftests.quarkus.core.service445.model.Model445;

final class Mapper {
    private Mapper() {}

    public static Model445 of(Entity445 entity) {
        return new Model445(entity.getId(), entity.getField());
    }
}
