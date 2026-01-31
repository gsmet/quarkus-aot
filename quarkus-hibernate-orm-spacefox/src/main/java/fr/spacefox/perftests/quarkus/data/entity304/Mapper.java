package fr.spacefox.perftests.quarkus.data.entity304;

import fr.spacefox.perftests.quarkus.core.service304.model.Model304;

final class Mapper {
    private Mapper() {}

    public static Model304 of(Entity304 entity) {
        return new Model304(entity.getId(), entity.getField());
    }
}
