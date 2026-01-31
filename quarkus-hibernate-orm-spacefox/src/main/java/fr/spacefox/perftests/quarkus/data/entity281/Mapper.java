package fr.spacefox.perftests.quarkus.data.entity281;

import fr.spacefox.perftests.quarkus.core.service281.model.Model281;

final class Mapper {
    private Mapper() {}

    public static Model281 of(Entity281 entity) {
        return new Model281(entity.getId(), entity.getField());
    }
}
