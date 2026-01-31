package fr.spacefox.perftests.quarkus.data.entity793;

import fr.spacefox.perftests.quarkus.core.service793.model.Model793;

final class Mapper {
    private Mapper() {}

    public static Model793 of(Entity793 entity) {
        return new Model793(entity.getId(), entity.getField());
    }
}
