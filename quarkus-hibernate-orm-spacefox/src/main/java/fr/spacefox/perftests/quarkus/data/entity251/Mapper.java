package fr.spacefox.perftests.quarkus.data.entity251;

import fr.spacefox.perftests.quarkus.core.service251.model.Model251;

final class Mapper {
    private Mapper() {}

    public static Model251 of(Entity251 entity) {
        return new Model251(entity.getId(), entity.getField());
    }
}
