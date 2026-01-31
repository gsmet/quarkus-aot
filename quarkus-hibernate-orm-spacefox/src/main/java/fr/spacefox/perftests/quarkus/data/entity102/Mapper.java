package fr.spacefox.perftests.quarkus.data.entity102;

import fr.spacefox.perftests.quarkus.core.service102.model.Model102;

final class Mapper {
    private Mapper() {}

    public static Model102 of(Entity102 entity) {
        return new Model102(entity.getId(), entity.getField());
    }
}
