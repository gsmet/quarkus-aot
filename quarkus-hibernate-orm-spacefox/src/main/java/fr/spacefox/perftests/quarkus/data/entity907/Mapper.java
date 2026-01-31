package fr.spacefox.perftests.quarkus.data.entity907;

import fr.spacefox.perftests.quarkus.core.service907.model.Model907;

final class Mapper {
    private Mapper() {}

    public static Model907 of(Entity907 entity) {
        return new Model907(entity.getId(), entity.getField());
    }
}
