package fr.spacefox.perftests.quarkus.data.entity432;

import fr.spacefox.perftests.quarkus.core.service432.model.Model432;

final class Mapper {
    private Mapper() {}

    public static Model432 of(Entity432 entity) {
        return new Model432(entity.getId(), entity.getField());
    }
}
