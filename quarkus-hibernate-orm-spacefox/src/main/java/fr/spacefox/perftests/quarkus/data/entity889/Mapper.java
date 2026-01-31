package fr.spacefox.perftests.quarkus.data.entity889;

import fr.spacefox.perftests.quarkus.core.service889.model.Model889;

final class Mapper {
    private Mapper() {}

    public static Model889 of(Entity889 entity) {
        return new Model889(entity.getId(), entity.getField());
    }
}
