package fr.spacefox.perftests.quarkus.data.entity937;

import fr.spacefox.perftests.quarkus.core.service937.model.Model937;

final class Mapper {
    private Mapper() {}

    public static Model937 of(Entity937 entity) {
        return new Model937(entity.getId(), entity.getField());
    }
}
