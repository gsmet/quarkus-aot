package fr.spacefox.perftests.quarkus.data.entity419;

import fr.spacefox.perftests.quarkus.core.service419.model.Model419;

final class Mapper {
    private Mapper() {}

    public static Model419 of(Entity419 entity) {
        return new Model419(entity.getId(), entity.getField());
    }
}
