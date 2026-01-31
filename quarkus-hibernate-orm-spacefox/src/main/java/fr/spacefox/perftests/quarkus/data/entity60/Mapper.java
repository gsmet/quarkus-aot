package fr.spacefox.perftests.quarkus.data.entity60;

import fr.spacefox.perftests.quarkus.core.service60.model.Model60;

final class Mapper {
    private Mapper() {}

    public static Model60 of(Entity60 entity) {
        return new Model60(entity.getId(), entity.getField());
    }
}
