package fr.spacefox.perftests.quarkus.data.entity75;

import fr.spacefox.perftests.quarkus.core.service75.model.Model75;

final class Mapper {
    private Mapper() {}

    public static Model75 of(Entity75 entity) {
        return new Model75(entity.getId(), entity.getField());
    }
}
