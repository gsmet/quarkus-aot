package fr.spacefox.perftests.quarkus.data.entity420;

import fr.spacefox.perftests.quarkus.core.service420.model.Model420;

final class Mapper {
    private Mapper() {}

    public static Model420 of(Entity420 entity) {
        return new Model420(entity.getId(), entity.getField());
    }
}
