package fr.spacefox.perftests.quarkus.data.entity741;

import fr.spacefox.perftests.quarkus.core.service741.model.Model741;

final class Mapper {
    private Mapper() {}

    public static Model741 of(Entity741 entity) {
        return new Model741(entity.getId(), entity.getField());
    }
}
