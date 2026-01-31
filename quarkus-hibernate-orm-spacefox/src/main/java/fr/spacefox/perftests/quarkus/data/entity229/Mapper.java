package fr.spacefox.perftests.quarkus.data.entity229;

import fr.spacefox.perftests.quarkus.core.service229.model.Model229;

final class Mapper {
    private Mapper() {}

    public static Model229 of(Entity229 entity) {
        return new Model229(entity.getId(), entity.getField());
    }
}
