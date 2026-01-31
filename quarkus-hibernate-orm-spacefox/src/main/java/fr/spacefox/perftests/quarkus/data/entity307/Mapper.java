package fr.spacefox.perftests.quarkus.data.entity307;

import fr.spacefox.perftests.quarkus.core.service307.model.Model307;

final class Mapper {
    private Mapper() {}

    public static Model307 of(Entity307 entity) {
        return new Model307(entity.getId(), entity.getField());
    }
}
