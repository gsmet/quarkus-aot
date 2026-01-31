package fr.spacefox.perftests.quarkus.data.entity230;

import fr.spacefox.perftests.quarkus.core.service230.model.Model230;

final class Mapper {
    private Mapper() {}

    public static Model230 of(Entity230 entity) {
        return new Model230(entity.getId(), entity.getField());
    }
}
