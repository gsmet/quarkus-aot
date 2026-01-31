package fr.spacefox.perftests.quarkus.data.entity290;

import fr.spacefox.perftests.quarkus.core.service290.model.Model290;

final class Mapper {
    private Mapper() {}

    public static Model290 of(Entity290 entity) {
        return new Model290(entity.getId(), entity.getField());
    }
}
