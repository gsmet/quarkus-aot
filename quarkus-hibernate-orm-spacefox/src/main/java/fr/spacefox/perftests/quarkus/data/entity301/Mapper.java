package fr.spacefox.perftests.quarkus.data.entity301;

import fr.spacefox.perftests.quarkus.core.service301.model.Model301;

final class Mapper {
    private Mapper() {}

    public static Model301 of(Entity301 entity) {
        return new Model301(entity.getId(), entity.getField());
    }
}
