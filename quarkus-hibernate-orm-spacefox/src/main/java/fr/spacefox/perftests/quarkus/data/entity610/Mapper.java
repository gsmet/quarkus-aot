package fr.spacefox.perftests.quarkus.data.entity610;

import fr.spacefox.perftests.quarkus.core.service610.model.Model610;

final class Mapper {
    private Mapper() {}

    public static Model610 of(Entity610 entity) {
        return new Model610(entity.getId(), entity.getField());
    }
}
