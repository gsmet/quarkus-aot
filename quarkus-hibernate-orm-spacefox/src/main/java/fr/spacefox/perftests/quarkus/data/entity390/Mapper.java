package fr.spacefox.perftests.quarkus.data.entity390;

import fr.spacefox.perftests.quarkus.core.service390.model.Model390;

final class Mapper {
    private Mapper() {}

    public static Model390 of(Entity390 entity) {
        return new Model390(entity.getId(), entity.getField());
    }
}
