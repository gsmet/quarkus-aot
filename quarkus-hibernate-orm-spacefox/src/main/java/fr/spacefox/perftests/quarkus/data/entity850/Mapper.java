package fr.spacefox.perftests.quarkus.data.entity850;

import fr.spacefox.perftests.quarkus.core.service850.model.Model850;

final class Mapper {
    private Mapper() {}

    public static Model850 of(Entity850 entity) {
        return new Model850(entity.getId(), entity.getField());
    }
}
