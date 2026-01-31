package fr.spacefox.perftests.quarkus.data.entity124;

import fr.spacefox.perftests.quarkus.core.service124.model.Model124;

final class Mapper {
    private Mapper() {}

    public static Model124 of(Entity124 entity) {
        return new Model124(entity.getId(), entity.getField());
    }
}
