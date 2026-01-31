package fr.spacefox.perftests.quarkus.data.entity456;

import fr.spacefox.perftests.quarkus.core.service456.model.Model456;

final class Mapper {
    private Mapper() {}

    public static Model456 of(Entity456 entity) {
        return new Model456(entity.getId(), entity.getField());
    }
}
