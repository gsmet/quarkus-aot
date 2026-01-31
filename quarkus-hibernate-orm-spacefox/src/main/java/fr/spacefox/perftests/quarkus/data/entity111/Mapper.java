package fr.spacefox.perftests.quarkus.data.entity111;

import fr.spacefox.perftests.quarkus.core.service111.model.Model111;

final class Mapper {
    private Mapper() {}

    public static Model111 of(Entity111 entity) {
        return new Model111(entity.getId(), entity.getField());
    }
}
