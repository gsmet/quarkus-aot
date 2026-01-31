package fr.spacefox.perftests.quarkus.data.entity232;

import fr.spacefox.perftests.quarkus.core.service232.model.Model232;

final class Mapper {
    private Mapper() {}

    public static Model232 of(Entity232 entity) {
        return new Model232(entity.getId(), entity.getField());
    }
}
