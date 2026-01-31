package fr.spacefox.perftests.quarkus.data.entity904;

import fr.spacefox.perftests.quarkus.core.service904.model.Model904;

final class Mapper {
    private Mapper() {}

    public static Model904 of(Entity904 entity) {
        return new Model904(entity.getId(), entity.getField());
    }
}
