package fr.spacefox.perftests.quarkus.data.entity855;

import fr.spacefox.perftests.quarkus.core.service855.model.Model855;

final class Mapper {
    private Mapper() {}

    public static Model855 of(Entity855 entity) {
        return new Model855(entity.getId(), entity.getField());
    }
}
