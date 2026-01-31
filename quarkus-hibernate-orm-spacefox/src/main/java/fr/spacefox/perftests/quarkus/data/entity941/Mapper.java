package fr.spacefox.perftests.quarkus.data.entity941;

import fr.spacefox.perftests.quarkus.core.service941.model.Model941;

final class Mapper {
    private Mapper() {}

    public static Model941 of(Entity941 entity) {
        return new Model941(entity.getId(), entity.getField());
    }
}
