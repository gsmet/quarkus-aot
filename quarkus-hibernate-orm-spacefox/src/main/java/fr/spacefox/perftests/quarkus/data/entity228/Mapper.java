package fr.spacefox.perftests.quarkus.data.entity228;

import fr.spacefox.perftests.quarkus.core.service228.model.Model228;

final class Mapper {
    private Mapper() {}

    public static Model228 of(Entity228 entity) {
        return new Model228(entity.getId(), entity.getField());
    }
}
