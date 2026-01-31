package fr.spacefox.perftests.quarkus.data.entity836;

import fr.spacefox.perftests.quarkus.core.service836.model.Model836;

final class Mapper {
    private Mapper() {}

    public static Model836 of(Entity836 entity) {
        return new Model836(entity.getId(), entity.getField());
    }
}
