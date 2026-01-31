package fr.spacefox.perftests.quarkus.data.entity303;

import fr.spacefox.perftests.quarkus.core.service303.model.Model303;

final class Mapper {
    private Mapper() {}

    public static Model303 of(Entity303 entity) {
        return new Model303(entity.getId(), entity.getField());
    }
}
