package fr.spacefox.perftests.quarkus.data.entity95;

import fr.spacefox.perftests.quarkus.core.service95.model.Model95;

final class Mapper {
    private Mapper() {}

    public static Model95 of(Entity95 entity) {
        return new Model95(entity.getId(), entity.getField());
    }
}
