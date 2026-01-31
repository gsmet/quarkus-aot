package fr.spacefox.perftests.quarkus.data.entity724;

import fr.spacefox.perftests.quarkus.core.service724.model.Model724;

final class Mapper {
    private Mapper() {}

    public static Model724 of(Entity724 entity) {
        return new Model724(entity.getId(), entity.getField());
    }
}
