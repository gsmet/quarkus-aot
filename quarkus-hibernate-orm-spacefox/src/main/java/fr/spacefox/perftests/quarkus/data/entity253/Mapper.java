package fr.spacefox.perftests.quarkus.data.entity253;

import fr.spacefox.perftests.quarkus.core.service253.model.Model253;

final class Mapper {
    private Mapper() {}

    public static Model253 of(Entity253 entity) {
        return new Model253(entity.getId(), entity.getField());
    }
}
