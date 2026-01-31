package fr.spacefox.perftests.quarkus.data.entity629;

import fr.spacefox.perftests.quarkus.core.service629.model.Model629;

final class Mapper {
    private Mapper() {}

    public static Model629 of(Entity629 entity) {
        return new Model629(entity.getId(), entity.getField());
    }
}
