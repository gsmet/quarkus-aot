package fr.spacefox.perftests.quarkus.data.entity608;

import fr.spacefox.perftests.quarkus.core.service608.model.Model608;

final class Mapper {
    private Mapper() {}

    public static Model608 of(Entity608 entity) {
        return new Model608(entity.getId(), entity.getField());
    }
}
