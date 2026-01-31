package fr.spacefox.perftests.quarkus.data.entity531;

import fr.spacefox.perftests.quarkus.core.service531.model.Model531;

final class Mapper {
    private Mapper() {}

    public static Model531 of(Entity531 entity) {
        return new Model531(entity.getId(), entity.getField());
    }
}
