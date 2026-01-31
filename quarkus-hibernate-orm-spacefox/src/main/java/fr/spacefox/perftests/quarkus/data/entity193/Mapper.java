package fr.spacefox.perftests.quarkus.data.entity193;

import fr.spacefox.perftests.quarkus.core.service193.model.Model193;

final class Mapper {
    private Mapper() {}

    public static Model193 of(Entity193 entity) {
        return new Model193(entity.getId(), entity.getField());
    }
}
