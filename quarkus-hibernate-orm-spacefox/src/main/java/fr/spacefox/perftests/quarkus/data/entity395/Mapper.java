package fr.spacefox.perftests.quarkus.data.entity395;

import fr.spacefox.perftests.quarkus.core.service395.model.Model395;

final class Mapper {
    private Mapper() {}

    public static Model395 of(Entity395 entity) {
        return new Model395(entity.getId(), entity.getField());
    }
}
