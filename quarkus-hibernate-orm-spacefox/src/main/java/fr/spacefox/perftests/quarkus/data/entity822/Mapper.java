package fr.spacefox.perftests.quarkus.data.entity822;

import fr.spacefox.perftests.quarkus.core.service822.model.Model822;

final class Mapper {
    private Mapper() {}

    public static Model822 of(Entity822 entity) {
        return new Model822(entity.getId(), entity.getField());
    }
}
