package fr.spacefox.perftests.quarkus.data.entity458;

import fr.spacefox.perftests.quarkus.core.service458.model.Model458;

final class Mapper {
    private Mapper() {}

    public static Model458 of(Entity458 entity) {
        return new Model458(entity.getId(), entity.getField());
    }
}
