package fr.spacefox.perftests.quarkus.data.entity527;

import fr.spacefox.perftests.quarkus.core.service527.model.Model527;

final class Mapper {
    private Mapper() {}

    public static Model527 of(Entity527 entity) {
        return new Model527(entity.getId(), entity.getField());
    }
}
