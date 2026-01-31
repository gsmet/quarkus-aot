package fr.spacefox.perftests.quarkus.data.entity106;

import fr.spacefox.perftests.quarkus.core.service106.model.Model106;

final class Mapper {
    private Mapper() {}

    public static Model106 of(Entity106 entity) {
        return new Model106(entity.getId(), entity.getField());
    }
}
