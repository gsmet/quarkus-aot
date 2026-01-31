package fr.spacefox.perftests.quarkus.data.entity510;

import fr.spacefox.perftests.quarkus.core.service510.model.Model510;

final class Mapper {
    private Mapper() {}

    public static Model510 of(Entity510 entity) {
        return new Model510(entity.getId(), entity.getField());
    }
}
