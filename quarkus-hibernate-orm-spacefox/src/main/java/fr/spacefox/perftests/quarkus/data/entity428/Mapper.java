package fr.spacefox.perftests.quarkus.data.entity428;

import fr.spacefox.perftests.quarkus.core.service428.model.Model428;

final class Mapper {
    private Mapper() {}

    public static Model428 of(Entity428 entity) {
        return new Model428(entity.getId(), entity.getField());
    }
}
