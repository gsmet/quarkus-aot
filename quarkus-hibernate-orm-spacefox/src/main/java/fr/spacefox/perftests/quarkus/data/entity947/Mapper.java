package fr.spacefox.perftests.quarkus.data.entity947;

import fr.spacefox.perftests.quarkus.core.service947.model.Model947;

final class Mapper {
    private Mapper() {}

    public static Model947 of(Entity947 entity) {
        return new Model947(entity.getId(), entity.getField());
    }
}
