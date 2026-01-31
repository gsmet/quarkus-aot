package fr.spacefox.perftests.quarkus.data.entity913;

import fr.spacefox.perftests.quarkus.core.service913.model.Model913;

final class Mapper {
    private Mapper() {}

    public static Model913 of(Entity913 entity) {
        return new Model913(entity.getId(), entity.getField());
    }
}
