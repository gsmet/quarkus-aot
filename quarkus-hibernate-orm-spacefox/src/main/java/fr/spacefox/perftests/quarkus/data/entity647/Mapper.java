package fr.spacefox.perftests.quarkus.data.entity647;

import fr.spacefox.perftests.quarkus.core.service647.model.Model647;

final class Mapper {
    private Mapper() {}

    public static Model647 of(Entity647 entity) {
        return new Model647(entity.getId(), entity.getField());
    }
}
