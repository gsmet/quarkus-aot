package fr.spacefox.perftests.quarkus.data.entity658;

import fr.spacefox.perftests.quarkus.core.service658.model.Model658;

final class Mapper {
    private Mapper() {}

    public static Model658 of(Entity658 entity) {
        return new Model658(entity.getId(), entity.getField());
    }
}
