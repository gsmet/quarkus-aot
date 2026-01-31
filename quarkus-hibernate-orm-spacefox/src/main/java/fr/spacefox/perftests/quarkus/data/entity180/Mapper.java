package fr.spacefox.perftests.quarkus.data.entity180;

import fr.spacefox.perftests.quarkus.core.service180.model.Model180;

final class Mapper {
    private Mapper() {}

    public static Model180 of(Entity180 entity) {
        return new Model180(entity.getId(), entity.getField());
    }
}
