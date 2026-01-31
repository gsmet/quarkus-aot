package fr.spacefox.perftests.quarkus.data.entity954;

import fr.spacefox.perftests.quarkus.core.service954.model.Model954;

final class Mapper {
    private Mapper() {}

    public static Model954 of(Entity954 entity) {
        return new Model954(entity.getId(), entity.getField());
    }
}
