package fr.spacefox.perftests.quarkus.data.entity77;

import fr.spacefox.perftests.quarkus.core.service77.model.Model77;

final class Mapper {
    private Mapper() {}

    public static Model77 of(Entity77 entity) {
        return new Model77(entity.getId(), entity.getField());
    }
}
