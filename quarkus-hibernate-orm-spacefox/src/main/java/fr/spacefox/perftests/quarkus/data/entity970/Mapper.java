package fr.spacefox.perftests.quarkus.data.entity970;

import fr.spacefox.perftests.quarkus.core.service970.model.Model970;

final class Mapper {
    private Mapper() {}

    public static Model970 of(Entity970 entity) {
        return new Model970(entity.getId(), entity.getField());
    }
}
