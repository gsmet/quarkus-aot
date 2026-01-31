package fr.spacefox.perftests.quarkus.data.entity604;

import fr.spacefox.perftests.quarkus.core.service604.model.Model604;

final class Mapper {
    private Mapper() {}

    public static Model604 of(Entity604 entity) {
        return new Model604(entity.getId(), entity.getField());
    }
}
