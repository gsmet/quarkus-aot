package fr.spacefox.perftests.quarkus.data.entity210;

import fr.spacefox.perftests.quarkus.core.service210.model.Model210;

final class Mapper {
    private Mapper() {}

    public static Model210 of(Entity210 entity) {
        return new Model210(entity.getId(), entity.getField());
    }
}
