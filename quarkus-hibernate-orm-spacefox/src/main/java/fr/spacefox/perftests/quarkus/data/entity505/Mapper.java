package fr.spacefox.perftests.quarkus.data.entity505;

import fr.spacefox.perftests.quarkus.core.service505.model.Model505;

final class Mapper {
    private Mapper() {}

    public static Model505 of(Entity505 entity) {
        return new Model505(entity.getId(), entity.getField());
    }
}
