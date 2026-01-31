package fr.spacefox.perftests.quarkus.data.entity249;

import fr.spacefox.perftests.quarkus.core.service249.model.Model249;

final class Mapper {
    private Mapper() {}

    public static Model249 of(Entity249 entity) {
        return new Model249(entity.getId(), entity.getField());
    }
}
