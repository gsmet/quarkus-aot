package fr.spacefox.perftests.quarkus.data.entity436;

import fr.spacefox.perftests.quarkus.core.service436.model.Model436;

final class Mapper {
    private Mapper() {}

    public static Model436 of(Entity436 entity) {
        return new Model436(entity.getId(), entity.getField());
    }
}
