package fr.spacefox.perftests.quarkus.data.entity309;

import fr.spacefox.perftests.quarkus.core.service309.model.Model309;

final class Mapper {
    private Mapper() {}

    public static Model309 of(Entity309 entity) {
        return new Model309(entity.getId(), entity.getField());
    }
}
