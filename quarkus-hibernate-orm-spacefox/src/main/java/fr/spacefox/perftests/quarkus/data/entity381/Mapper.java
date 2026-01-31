package fr.spacefox.perftests.quarkus.data.entity381;

import fr.spacefox.perftests.quarkus.core.service381.model.Model381;

final class Mapper {
    private Mapper() {}

    public static Model381 of(Entity381 entity) {
        return new Model381(entity.getId(), entity.getField());
    }
}
