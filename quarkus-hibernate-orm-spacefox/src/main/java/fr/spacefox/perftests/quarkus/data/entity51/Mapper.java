package fr.spacefox.perftests.quarkus.data.entity51;

import fr.spacefox.perftests.quarkus.core.service51.model.Model51;

final class Mapper {
    private Mapper() {}

    public static Model51 of(Entity51 entity) {
        return new Model51(entity.getId(), entity.getField());
    }
}
