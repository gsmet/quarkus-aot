package fr.spacefox.perftests.quarkus.data.entity525;

import fr.spacefox.perftests.quarkus.core.service525.model.Model525;

final class Mapper {
    private Mapper() {}

    public static Model525 of(Entity525 entity) {
        return new Model525(entity.getId(), entity.getField());
    }
}
