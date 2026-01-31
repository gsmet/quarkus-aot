package fr.spacefox.perftests.quarkus.data.entity155;

import fr.spacefox.perftests.quarkus.core.service155.model.Model155;

final class Mapper {
    private Mapper() {}

    public static Model155 of(Entity155 entity) {
        return new Model155(entity.getId(), entity.getField());
    }
}
