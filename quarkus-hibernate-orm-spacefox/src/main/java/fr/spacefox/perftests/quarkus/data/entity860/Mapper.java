package fr.spacefox.perftests.quarkus.data.entity860;

import fr.spacefox.perftests.quarkus.core.service860.model.Model860;

final class Mapper {
    private Mapper() {}

    public static Model860 of(Entity860 entity) {
        return new Model860(entity.getId(), entity.getField());
    }
}
