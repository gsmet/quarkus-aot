package fr.spacefox.perftests.quarkus.data.entity619;

import fr.spacefox.perftests.quarkus.core.service619.model.Model619;

final class Mapper {
    private Mapper() {}

    public static Model619 of(Entity619 entity) {
        return new Model619(entity.getId(), entity.getField());
    }
}
