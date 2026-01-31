package fr.spacefox.perftests.quarkus.data.entity135;

import fr.spacefox.perftests.quarkus.core.service135.model.Model135;

final class Mapper {
    private Mapper() {}

    public static Model135 of(Entity135 entity) {
        return new Model135(entity.getId(), entity.getField());
    }
}
