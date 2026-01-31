package fr.spacefox.perftests.quarkus.data.entity427;

import fr.spacefox.perftests.quarkus.core.service427.model.Model427;

final class Mapper {
    private Mapper() {}

    public static Model427 of(Entity427 entity) {
        return new Model427(entity.getId(), entity.getField());
    }
}
