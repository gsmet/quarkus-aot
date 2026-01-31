package fr.spacefox.perftests.quarkus.data.entity912;

import fr.spacefox.perftests.quarkus.core.service912.model.Model912;

final class Mapper {
    private Mapper() {}

    public static Model912 of(Entity912 entity) {
        return new Model912(entity.getId(), entity.getField());
    }
}
