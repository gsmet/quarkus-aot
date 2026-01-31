package fr.spacefox.perftests.quarkus.data.entity877;

import fr.spacefox.perftests.quarkus.core.service877.model.Model877;

final class Mapper {
    private Mapper() {}

    public static Model877 of(Entity877 entity) {
        return new Model877(entity.getId(), entity.getField());
    }
}
