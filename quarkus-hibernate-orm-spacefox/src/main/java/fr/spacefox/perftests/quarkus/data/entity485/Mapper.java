package fr.spacefox.perftests.quarkus.data.entity485;

import fr.spacefox.perftests.quarkus.core.service485.model.Model485;

final class Mapper {
    private Mapper() {}

    public static Model485 of(Entity485 entity) {
        return new Model485(entity.getId(), entity.getField());
    }
}
