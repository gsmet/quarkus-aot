package fr.spacefox.perftests.quarkus.data.entity833;

import fr.spacefox.perftests.quarkus.core.service833.model.Model833;

final class Mapper {
    private Mapper() {}

    public static Model833 of(Entity833 entity) {
        return new Model833(entity.getId(), entity.getField());
    }
}
