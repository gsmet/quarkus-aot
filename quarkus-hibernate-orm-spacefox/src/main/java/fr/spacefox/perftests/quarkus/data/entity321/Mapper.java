package fr.spacefox.perftests.quarkus.data.entity321;

import fr.spacefox.perftests.quarkus.core.service321.model.Model321;

final class Mapper {
    private Mapper() {}

    public static Model321 of(Entity321 entity) {
        return new Model321(entity.getId(), entity.getField());
    }
}
