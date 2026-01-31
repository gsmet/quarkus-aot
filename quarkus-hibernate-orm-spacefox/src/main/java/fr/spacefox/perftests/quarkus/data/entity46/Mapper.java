package fr.spacefox.perftests.quarkus.data.entity46;

import fr.spacefox.perftests.quarkus.core.service46.model.Model46;

final class Mapper {
    private Mapper() {}

    public static Model46 of(Entity46 entity) {
        return new Model46(entity.getId(), entity.getField());
    }
}
