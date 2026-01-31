package fr.spacefox.perftests.quarkus.data.entity410;

import fr.spacefox.perftests.quarkus.core.service410.model.Model410;

final class Mapper {
    private Mapper() {}

    public static Model410 of(Entity410 entity) {
        return new Model410(entity.getId(), entity.getField());
    }
}
