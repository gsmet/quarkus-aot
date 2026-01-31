package fr.spacefox.perftests.quarkus.data.entity43;

import fr.spacefox.perftests.quarkus.core.service43.model.Model43;

final class Mapper {
    private Mapper() {}

    public static Model43 of(Entity43 entity) {
        return new Model43(entity.getId(), entity.getField());
    }
}
