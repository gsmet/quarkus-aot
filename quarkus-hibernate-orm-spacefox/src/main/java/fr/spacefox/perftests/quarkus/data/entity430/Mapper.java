package fr.spacefox.perftests.quarkus.data.entity430;

import fr.spacefox.perftests.quarkus.core.service430.model.Model430;

final class Mapper {
    private Mapper() {}

    public static Model430 of(Entity430 entity) {
        return new Model430(entity.getId(), entity.getField());
    }
}
