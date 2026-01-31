package fr.spacefox.perftests.quarkus.data.entity733;

import fr.spacefox.perftests.quarkus.core.service733.model.Model733;

final class Mapper {
    private Mapper() {}

    public static Model733 of(Entity733 entity) {
        return new Model733(entity.getId(), entity.getField());
    }
}
