package fr.spacefox.perftests.quarkus.data.entity386;

import fr.spacefox.perftests.quarkus.core.service386.model.Model386;

final class Mapper {
    private Mapper() {}

    public static Model386 of(Entity386 entity) {
        return new Model386(entity.getId(), entity.getField());
    }
}
