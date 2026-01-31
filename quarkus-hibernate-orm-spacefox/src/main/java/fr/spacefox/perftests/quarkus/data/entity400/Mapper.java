package fr.spacefox.perftests.quarkus.data.entity400;

import fr.spacefox.perftests.quarkus.core.service400.model.Model400;

final class Mapper {
    private Mapper() {}

    public static Model400 of(Entity400 entity) {
        return new Model400(entity.getId(), entity.getField());
    }
}
