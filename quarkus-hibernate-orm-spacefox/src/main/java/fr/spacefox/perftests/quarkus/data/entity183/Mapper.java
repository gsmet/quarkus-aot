package fr.spacefox.perftests.quarkus.data.entity183;

import fr.spacefox.perftests.quarkus.core.service183.model.Model183;

final class Mapper {
    private Mapper() {}

    public static Model183 of(Entity183 entity) {
        return new Model183(entity.getId(), entity.getField());
    }
}
