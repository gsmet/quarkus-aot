package fr.spacefox.perftests.quarkus.data.entity409;

import fr.spacefox.perftests.quarkus.core.service409.model.Model409;

final class Mapper {
    private Mapper() {}

    public static Model409 of(Entity409 entity) {
        return new Model409(entity.getId(), entity.getField());
    }
}
