package fr.spacefox.perftests.quarkus.data.entity487;

import fr.spacefox.perftests.quarkus.core.service487.model.Model487;

final class Mapper {
    private Mapper() {}

    public static Model487 of(Entity487 entity) {
        return new Model487(entity.getId(), entity.getField());
    }
}
