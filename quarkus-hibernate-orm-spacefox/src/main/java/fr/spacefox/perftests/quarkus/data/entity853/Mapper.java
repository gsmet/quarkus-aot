package fr.spacefox.perftests.quarkus.data.entity853;

import fr.spacefox.perftests.quarkus.core.service853.model.Model853;

final class Mapper {
    private Mapper() {}

    public static Model853 of(Entity853 entity) {
        return new Model853(entity.getId(), entity.getField());
    }
}
