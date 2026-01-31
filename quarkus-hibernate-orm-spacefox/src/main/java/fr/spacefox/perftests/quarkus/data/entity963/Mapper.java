package fr.spacefox.perftests.quarkus.data.entity963;

import fr.spacefox.perftests.quarkus.core.service963.model.Model963;

final class Mapper {
    private Mapper() {}

    public static Model963 of(Entity963 entity) {
        return new Model963(entity.getId(), entity.getField());
    }
}
