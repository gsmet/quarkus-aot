package fr.spacefox.perftests.quarkus.data.entity563;

import fr.spacefox.perftests.quarkus.core.service563.model.Model563;

final class Mapper {
    private Mapper() {}

    public static Model563 of(Entity563 entity) {
        return new Model563(entity.getId(), entity.getField());
    }
}
