package fr.spacefox.perftests.quarkus.data.entity554;

import fr.spacefox.perftests.quarkus.core.service554.model.Model554;

final class Mapper {
    private Mapper() {}

    public static Model554 of(Entity554 entity) {
        return new Model554(entity.getId(), entity.getField());
    }
}
