package fr.spacefox.perftests.quarkus.data.entity561;

import fr.spacefox.perftests.quarkus.core.service561.model.Model561;

final class Mapper {
    private Mapper() {}

    public static Model561 of(Entity561 entity) {
        return new Model561(entity.getId(), entity.getField());
    }
}
