package fr.spacefox.perftests.quarkus.data.entity317;

import fr.spacefox.perftests.quarkus.core.service317.model.Model317;

final class Mapper {
    private Mapper() {}

    public static Model317 of(Entity317 entity) {
        return new Model317(entity.getId(), entity.getField());
    }
}
