package fr.spacefox.perftests.quarkus.data.entity45;

import fr.spacefox.perftests.quarkus.core.service45.model.Model45;

final class Mapper {
    private Mapper() {}

    public static Model45 of(Entity45 entity) {
        return new Model45(entity.getId(), entity.getField());
    }
}
