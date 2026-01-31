package fr.spacefox.perftests.quarkus.data.entity163;

import fr.spacefox.perftests.quarkus.core.service163.model.Model163;

final class Mapper {
    private Mapper() {}

    public static Model163 of(Entity163 entity) {
        return new Model163(entity.getId(), entity.getField());
    }
}
