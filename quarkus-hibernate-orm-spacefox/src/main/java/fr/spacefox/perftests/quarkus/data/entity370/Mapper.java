package fr.spacefox.perftests.quarkus.data.entity370;

import fr.spacefox.perftests.quarkus.core.service370.model.Model370;

final class Mapper {
    private Mapper() {}

    public static Model370 of(Entity370 entity) {
        return new Model370(entity.getId(), entity.getField());
    }
}
