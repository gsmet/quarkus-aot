package fr.spacefox.perftests.quarkus.data.entity494;

import fr.spacefox.perftests.quarkus.core.service494.model.Model494;

final class Mapper {
    private Mapper() {}

    public static Model494 of(Entity494 entity) {
        return new Model494(entity.getId(), entity.getField());
    }
}
