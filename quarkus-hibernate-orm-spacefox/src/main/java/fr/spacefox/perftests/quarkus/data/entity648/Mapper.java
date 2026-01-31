package fr.spacefox.perftests.quarkus.data.entity648;

import fr.spacefox.perftests.quarkus.core.service648.model.Model648;

final class Mapper {
    private Mapper() {}

    public static Model648 of(Entity648 entity) {
        return new Model648(entity.getId(), entity.getField());
    }
}
