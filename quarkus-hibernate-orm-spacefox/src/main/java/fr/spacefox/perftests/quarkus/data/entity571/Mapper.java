package fr.spacefox.perftests.quarkus.data.entity571;

import fr.spacefox.perftests.quarkus.core.service571.model.Model571;

final class Mapper {
    private Mapper() {}

    public static Model571 of(Entity571 entity) {
        return new Model571(entity.getId(), entity.getField());
    }
}
