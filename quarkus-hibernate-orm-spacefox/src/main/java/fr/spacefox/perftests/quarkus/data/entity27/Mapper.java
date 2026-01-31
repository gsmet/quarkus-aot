package fr.spacefox.perftests.quarkus.data.entity27;

import fr.spacefox.perftests.quarkus.core.service27.model.Model27;

final class Mapper {
    private Mapper() {}

    public static Model27 of(Entity27 entity) {
        return new Model27(entity.getId(), entity.getField());
    }
}
