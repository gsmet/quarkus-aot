package fr.spacefox.perftests.quarkus.data.entity384;

import fr.spacefox.perftests.quarkus.core.service384.model.Model384;

final class Mapper {
    private Mapper() {}

    public static Model384 of(Entity384 entity) {
        return new Model384(entity.getId(), entity.getField());
    }
}
