package fr.spacefox.perftests.quarkus.data.entity236;

import fr.spacefox.perftests.quarkus.core.service236.model.Model236;

final class Mapper {
    private Mapper() {}

    public static Model236 of(Entity236 entity) {
        return new Model236(entity.getId(), entity.getField());
    }
}
