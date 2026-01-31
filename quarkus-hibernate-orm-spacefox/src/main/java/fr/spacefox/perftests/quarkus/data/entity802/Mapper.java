package fr.spacefox.perftests.quarkus.data.entity802;

import fr.spacefox.perftests.quarkus.core.service802.model.Model802;

final class Mapper {
    private Mapper() {}

    public static Model802 of(Entity802 entity) {
        return new Model802(entity.getId(), entity.getField());
    }
}
