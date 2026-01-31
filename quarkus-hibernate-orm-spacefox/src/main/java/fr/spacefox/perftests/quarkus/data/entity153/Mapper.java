package fr.spacefox.perftests.quarkus.data.entity153;

import fr.spacefox.perftests.quarkus.core.service153.model.Model153;

final class Mapper {
    private Mapper() {}

    public static Model153 of(Entity153 entity) {
        return new Model153(entity.getId(), entity.getField());
    }
}
