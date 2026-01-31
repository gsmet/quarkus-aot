package fr.spacefox.perftests.quarkus.data.entity417;

import fr.spacefox.perftests.quarkus.core.service417.model.Model417;

final class Mapper {
    private Mapper() {}

    public static Model417 of(Entity417 entity) {
        return new Model417(entity.getId(), entity.getField());
    }
}
