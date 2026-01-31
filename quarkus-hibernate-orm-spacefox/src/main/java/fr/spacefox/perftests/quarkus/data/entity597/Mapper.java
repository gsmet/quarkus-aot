package fr.spacefox.perftests.quarkus.data.entity597;

import fr.spacefox.perftests.quarkus.core.service597.model.Model597;

final class Mapper {
    private Mapper() {}

    public static Model597 of(Entity597 entity) {
        return new Model597(entity.getId(), entity.getField());
    }
}
