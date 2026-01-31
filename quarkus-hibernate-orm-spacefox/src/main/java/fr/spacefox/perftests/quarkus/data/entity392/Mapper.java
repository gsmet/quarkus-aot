package fr.spacefox.perftests.quarkus.data.entity392;

import fr.spacefox.perftests.quarkus.core.service392.model.Model392;

final class Mapper {
    private Mapper() {}

    public static Model392 of(Entity392 entity) {
        return new Model392(entity.getId(), entity.getField());
    }
}
