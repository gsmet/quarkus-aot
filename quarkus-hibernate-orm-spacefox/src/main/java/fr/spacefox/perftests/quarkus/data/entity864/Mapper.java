package fr.spacefox.perftests.quarkus.data.entity864;

import fr.spacefox.perftests.quarkus.core.service864.model.Model864;

final class Mapper {
    private Mapper() {}

    public static Model864 of(Entity864 entity) {
        return new Model864(entity.getId(), entity.getField());
    }
}
