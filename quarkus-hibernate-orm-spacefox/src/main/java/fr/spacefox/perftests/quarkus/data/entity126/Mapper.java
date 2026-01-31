package fr.spacefox.perftests.quarkus.data.entity126;

import fr.spacefox.perftests.quarkus.core.service126.model.Model126;

final class Mapper {
    private Mapper() {}

    public static Model126 of(Entity126 entity) {
        return new Model126(entity.getId(), entity.getField());
    }
}
