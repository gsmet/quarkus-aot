package fr.spacefox.perftests.quarkus.data.entity740;

import fr.spacefox.perftests.quarkus.core.service740.model.Model740;

final class Mapper {
    private Mapper() {}

    public static Model740 of(Entity740 entity) {
        return new Model740(entity.getId(), entity.getField());
    }
}
