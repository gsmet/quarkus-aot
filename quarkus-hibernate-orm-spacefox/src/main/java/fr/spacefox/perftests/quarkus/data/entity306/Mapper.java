package fr.spacefox.perftests.quarkus.data.entity306;

import fr.spacefox.perftests.quarkus.core.service306.model.Model306;

final class Mapper {
    private Mapper() {}

    public static Model306 of(Entity306 entity) {
        return new Model306(entity.getId(), entity.getField());
    }
}
