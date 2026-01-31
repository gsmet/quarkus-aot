package fr.spacefox.perftests.quarkus.data.entity389;

import fr.spacefox.perftests.quarkus.core.service389.model.Model389;

final class Mapper {
    private Mapper() {}

    public static Model389 of(Entity389 entity) {
        return new Model389(entity.getId(), entity.getField());
    }
}
