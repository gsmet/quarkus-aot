package fr.spacefox.perftests.quarkus.data.entity361;

import fr.spacefox.perftests.quarkus.core.service361.model.Model361;

final class Mapper {
    private Mapper() {}

    public static Model361 of(Entity361 entity) {
        return new Model361(entity.getId(), entity.getField());
    }
}
