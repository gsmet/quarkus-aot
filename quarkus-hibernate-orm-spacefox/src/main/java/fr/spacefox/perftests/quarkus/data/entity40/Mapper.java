package fr.spacefox.perftests.quarkus.data.entity40;

import fr.spacefox.perftests.quarkus.core.service40.model.Model40;

final class Mapper {
    private Mapper() {}

    public static Model40 of(Entity40 entity) {
        return new Model40(entity.getId(), entity.getField());
    }
}
