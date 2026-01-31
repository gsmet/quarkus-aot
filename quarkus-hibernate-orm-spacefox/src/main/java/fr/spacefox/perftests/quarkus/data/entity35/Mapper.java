package fr.spacefox.perftests.quarkus.data.entity35;

import fr.spacefox.perftests.quarkus.core.service35.model.Model35;

final class Mapper {
    private Mapper() {}

    public static Model35 of(Entity35 entity) {
        return new Model35(entity.getId(), entity.getField());
    }
}
