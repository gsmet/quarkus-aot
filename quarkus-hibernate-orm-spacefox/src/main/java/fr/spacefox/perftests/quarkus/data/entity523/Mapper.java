package fr.spacefox.perftests.quarkus.data.entity523;

import fr.spacefox.perftests.quarkus.core.service523.model.Model523;

final class Mapper {
    private Mapper() {}

    public static Model523 of(Entity523 entity) {
        return new Model523(entity.getId(), entity.getField());
    }
}
