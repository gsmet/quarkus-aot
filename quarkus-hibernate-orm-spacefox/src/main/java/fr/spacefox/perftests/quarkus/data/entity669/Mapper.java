package fr.spacefox.perftests.quarkus.data.entity669;

import fr.spacefox.perftests.quarkus.core.service669.model.Model669;

final class Mapper {
    private Mapper() {}

    public static Model669 of(Entity669 entity) {
        return new Model669(entity.getId(), entity.getField());
    }
}
