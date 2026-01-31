package fr.spacefox.perftests.quarkus.data.entity646;

import fr.spacefox.perftests.quarkus.core.service646.model.Model646;

final class Mapper {
    private Mapper() {}

    public static Model646 of(Entity646 entity) {
        return new Model646(entity.getId(), entity.getField());
    }
}
