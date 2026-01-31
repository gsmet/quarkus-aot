package fr.spacefox.perftests.quarkus.data.entity277;

import fr.spacefox.perftests.quarkus.core.service277.model.Model277;

final class Mapper {
    private Mapper() {}

    public static Model277 of(Entity277 entity) {
        return new Model277(entity.getId(), entity.getField());
    }
}
