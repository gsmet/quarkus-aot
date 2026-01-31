package fr.spacefox.perftests.quarkus.data.entity84;

import fr.spacefox.perftests.quarkus.core.service84.model.Model84;

final class Mapper {
    private Mapper() {}

    public static Model84 of(Entity84 entity) {
        return new Model84(entity.getId(), entity.getField());
    }
}
