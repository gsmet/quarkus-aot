package fr.spacefox.perftests.quarkus.data.entity360;

import fr.spacefox.perftests.quarkus.core.service360.model.Model360;

final class Mapper {
    private Mapper() {}

    public static Model360 of(Entity360 entity) {
        return new Model360(entity.getId(), entity.getField());
    }
}
