package fr.spacefox.perftests.quarkus.data.entity999;

import fr.spacefox.perftests.quarkus.core.service999.model.Model999;

final class Mapper {
    private Mapper() {}

    public static Model999 of(Entity999 entity) {
        return new Model999(entity.getId(), entity.getField());
    }
}
