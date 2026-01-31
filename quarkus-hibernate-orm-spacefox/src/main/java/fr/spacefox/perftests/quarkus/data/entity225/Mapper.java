package fr.spacefox.perftests.quarkus.data.entity225;

import fr.spacefox.perftests.quarkus.core.service225.model.Model225;

final class Mapper {
    private Mapper() {}

    public static Model225 of(Entity225 entity) {
        return new Model225(entity.getId(), entity.getField());
    }
}
