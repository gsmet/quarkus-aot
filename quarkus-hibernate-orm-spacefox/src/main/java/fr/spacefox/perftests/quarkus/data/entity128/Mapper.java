package fr.spacefox.perftests.quarkus.data.entity128;

import fr.spacefox.perftests.quarkus.core.service128.model.Model128;

final class Mapper {
    private Mapper() {}

    public static Model128 of(Entity128 entity) {
        return new Model128(entity.getId(), entity.getField());
    }
}
