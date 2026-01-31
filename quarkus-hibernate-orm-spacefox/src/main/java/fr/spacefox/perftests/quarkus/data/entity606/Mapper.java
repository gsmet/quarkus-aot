package fr.spacefox.perftests.quarkus.data.entity606;

import fr.spacefox.perftests.quarkus.core.service606.model.Model606;

final class Mapper {
    private Mapper() {}

    public static Model606 of(Entity606 entity) {
        return new Model606(entity.getId(), entity.getField());
    }
}
