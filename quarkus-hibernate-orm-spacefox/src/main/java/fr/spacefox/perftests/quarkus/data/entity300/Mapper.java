package fr.spacefox.perftests.quarkus.data.entity300;

import fr.spacefox.perftests.quarkus.core.service300.model.Model300;

final class Mapper {
    private Mapper() {}

    public static Model300 of(Entity300 entity) {
        return new Model300(entity.getId(), entity.getField());
    }
}
