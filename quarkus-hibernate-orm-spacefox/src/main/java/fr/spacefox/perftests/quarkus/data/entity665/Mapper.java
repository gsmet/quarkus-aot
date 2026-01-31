package fr.spacefox.perftests.quarkus.data.entity665;

import fr.spacefox.perftests.quarkus.core.service665.model.Model665;

final class Mapper {
    private Mapper() {}

    public static Model665 of(Entity665 entity) {
        return new Model665(entity.getId(), entity.getField());
    }
}
