package fr.spacefox.perftests.quarkus.data.entity248;

import fr.spacefox.perftests.quarkus.core.service248.model.Model248;

final class Mapper {
    private Mapper() {}

    public static Model248 of(Entity248 entity) {
        return new Model248(entity.getId(), entity.getField());
    }
}
