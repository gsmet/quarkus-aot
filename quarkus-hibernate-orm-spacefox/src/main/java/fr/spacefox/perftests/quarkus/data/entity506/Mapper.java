package fr.spacefox.perftests.quarkus.data.entity506;

import fr.spacefox.perftests.quarkus.core.service506.model.Model506;

final class Mapper {
    private Mapper() {}

    public static Model506 of(Entity506 entity) {
        return new Model506(entity.getId(), entity.getField());
    }
}
