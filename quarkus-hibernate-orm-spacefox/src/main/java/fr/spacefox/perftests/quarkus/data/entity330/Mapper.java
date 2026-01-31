package fr.spacefox.perftests.quarkus.data.entity330;

import fr.spacefox.perftests.quarkus.core.service330.model.Model330;

final class Mapper {
    private Mapper() {}

    public static Model330 of(Entity330 entity) {
        return new Model330(entity.getId(), entity.getField());
    }
}
