package fr.spacefox.perftests.quarkus.data.entity371;

import fr.spacefox.perftests.quarkus.core.service371.model.Model371;

final class Mapper {
    private Mapper() {}

    public static Model371 of(Entity371 entity) {
        return new Model371(entity.getId(), entity.getField());
    }
}
