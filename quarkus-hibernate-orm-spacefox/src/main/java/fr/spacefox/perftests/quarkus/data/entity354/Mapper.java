package fr.spacefox.perftests.quarkus.data.entity354;

import fr.spacefox.perftests.quarkus.core.service354.model.Model354;

final class Mapper {
    private Mapper() {}

    public static Model354 of(Entity354 entity) {
        return new Model354(entity.getId(), entity.getField());
    }
}
