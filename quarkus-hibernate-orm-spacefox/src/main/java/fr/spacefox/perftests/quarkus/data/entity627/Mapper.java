package fr.spacefox.perftests.quarkus.data.entity627;

import fr.spacefox.perftests.quarkus.core.service627.model.Model627;

final class Mapper {
    private Mapper() {}

    public static Model627 of(Entity627 entity) {
        return new Model627(entity.getId(), entity.getField());
    }
}
