package fr.spacefox.perftests.quarkus.data.entity709;

import fr.spacefox.perftests.quarkus.core.service709.model.Model709;

final class Mapper {
    private Mapper() {}

    public static Model709 of(Entity709 entity) {
        return new Model709(entity.getId(), entity.getField());
    }
}
