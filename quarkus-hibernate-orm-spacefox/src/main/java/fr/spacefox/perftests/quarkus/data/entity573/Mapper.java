package fr.spacefox.perftests.quarkus.data.entity573;

import fr.spacefox.perftests.quarkus.core.service573.model.Model573;

final class Mapper {
    private Mapper() {}

    public static Model573 of(Entity573 entity) {
        return new Model573(entity.getId(), entity.getField());
    }
}
