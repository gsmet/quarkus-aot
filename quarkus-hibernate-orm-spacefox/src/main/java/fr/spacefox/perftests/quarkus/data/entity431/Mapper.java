package fr.spacefox.perftests.quarkus.data.entity431;

import fr.spacefox.perftests.quarkus.core.service431.model.Model431;

final class Mapper {
    private Mapper() {}

    public static Model431 of(Entity431 entity) {
        return new Model431(entity.getId(), entity.getField());
    }
}
