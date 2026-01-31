package fr.spacefox.perftests.quarkus.data.entity664;

import fr.spacefox.perftests.quarkus.core.service664.model.Model664;

final class Mapper {
    private Mapper() {}

    public static Model664 of(Entity664 entity) {
        return new Model664(entity.getId(), entity.getField());
    }
}
