package fr.spacefox.perftests.quarkus.data.entity519;

import fr.spacefox.perftests.quarkus.core.service519.model.Model519;

final class Mapper {
    private Mapper() {}

    public static Model519 of(Entity519 entity) {
        return new Model519(entity.getId(), entity.getField());
    }
}
