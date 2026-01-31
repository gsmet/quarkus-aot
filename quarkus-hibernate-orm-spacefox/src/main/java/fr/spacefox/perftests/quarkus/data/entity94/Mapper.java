package fr.spacefox.perftests.quarkus.data.entity94;

import fr.spacefox.perftests.quarkus.core.service94.model.Model94;

final class Mapper {
    private Mapper() {}

    public static Model94 of(Entity94 entity) {
        return new Model94(entity.getId(), entity.getField());
    }
}
