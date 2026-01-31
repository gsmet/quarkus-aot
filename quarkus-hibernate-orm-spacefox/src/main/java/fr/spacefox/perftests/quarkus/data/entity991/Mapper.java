package fr.spacefox.perftests.quarkus.data.entity991;

import fr.spacefox.perftests.quarkus.core.service991.model.Model991;

final class Mapper {
    private Mapper() {}

    public static Model991 of(Entity991 entity) {
        return new Model991(entity.getId(), entity.getField());
    }
}
