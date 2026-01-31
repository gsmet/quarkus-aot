package fr.spacefox.perftests.quarkus.data.entity549;

import fr.spacefox.perftests.quarkus.core.service549.model.Model549;

final class Mapper {
    private Mapper() {}

    public static Model549 of(Entity549 entity) {
        return new Model549(entity.getId(), entity.getField());
    }
}
