package fr.spacefox.perftests.quarkus.data.entity24;

import fr.spacefox.perftests.quarkus.core.service24.model.Model24;

final class Mapper {
    private Mapper() {}

    public static Model24 of(Entity24 entity) {
        return new Model24(entity.getId(), entity.getField());
    }
}
