package fr.spacefox.perftests.quarkus.data.entity334;

import fr.spacefox.perftests.quarkus.core.service334.model.Model334;

final class Mapper {
    private Mapper() {}

    public static Model334 of(Entity334 entity) {
        return new Model334(entity.getId(), entity.getField());
    }
}
