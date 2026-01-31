package fr.spacefox.perftests.quarkus.data.entity950;

import fr.spacefox.perftests.quarkus.core.service950.model.Model950;

final class Mapper {
    private Mapper() {}

    public static Model950 of(Entity950 entity) {
        return new Model950(entity.getId(), entity.getField());
    }
}
