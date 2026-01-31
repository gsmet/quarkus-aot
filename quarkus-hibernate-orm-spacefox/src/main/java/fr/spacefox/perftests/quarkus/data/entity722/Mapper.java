package fr.spacefox.perftests.quarkus.data.entity722;

import fr.spacefox.perftests.quarkus.core.service722.model.Model722;

final class Mapper {
    private Mapper() {}

    public static Model722 of(Entity722 entity) {
        return new Model722(entity.getId(), entity.getField());
    }
}
