package fr.spacefox.perftests.quarkus.data.entity435;

import fr.spacefox.perftests.quarkus.core.service435.model.Model435;

final class Mapper {
    private Mapper() {}

    public static Model435 of(Entity435 entity) {
        return new Model435(entity.getId(), entity.getField());
    }
}
