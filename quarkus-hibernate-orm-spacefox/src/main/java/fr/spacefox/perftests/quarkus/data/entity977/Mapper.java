package fr.spacefox.perftests.quarkus.data.entity977;

import fr.spacefox.perftests.quarkus.core.service977.model.Model977;

final class Mapper {
    private Mapper() {}

    public static Model977 of(Entity977 entity) {
        return new Model977(entity.getId(), entity.getField());
    }
}
