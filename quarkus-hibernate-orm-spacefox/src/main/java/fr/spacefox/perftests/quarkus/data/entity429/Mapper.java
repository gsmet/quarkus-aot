package fr.spacefox.perftests.quarkus.data.entity429;

import fr.spacefox.perftests.quarkus.core.service429.model.Model429;

final class Mapper {
    private Mapper() {}

    public static Model429 of(Entity429 entity) {
        return new Model429(entity.getId(), entity.getField());
    }
}
