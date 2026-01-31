package fr.spacefox.perftests.quarkus.data.entity480;

import fr.spacefox.perftests.quarkus.core.service480.model.Model480;

final class Mapper {
    private Mapper() {}

    public static Model480 of(Entity480 entity) {
        return new Model480(entity.getId(), entity.getField());
    }
}
