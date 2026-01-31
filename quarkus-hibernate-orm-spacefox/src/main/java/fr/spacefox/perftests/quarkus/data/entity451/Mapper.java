package fr.spacefox.perftests.quarkus.data.entity451;

import fr.spacefox.perftests.quarkus.core.service451.model.Model451;

final class Mapper {
    private Mapper() {}

    public static Model451 of(Entity451 entity) {
        return new Model451(entity.getId(), entity.getField());
    }
}
