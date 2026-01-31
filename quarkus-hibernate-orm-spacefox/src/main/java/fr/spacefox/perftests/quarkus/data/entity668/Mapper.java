package fr.spacefox.perftests.quarkus.data.entity668;

import fr.spacefox.perftests.quarkus.core.service668.model.Model668;

final class Mapper {
    private Mapper() {}

    public static Model668 of(Entity668 entity) {
        return new Model668(entity.getId(), entity.getField());
    }
}
