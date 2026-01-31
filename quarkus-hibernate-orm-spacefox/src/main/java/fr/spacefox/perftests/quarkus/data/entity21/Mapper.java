package fr.spacefox.perftests.quarkus.data.entity21;

import fr.spacefox.perftests.quarkus.core.service21.model.Model21;

final class Mapper {
    private Mapper() {}

    public static Model21 of(Entity21 entity) {
        return new Model21(entity.getId(), entity.getField());
    }
}
