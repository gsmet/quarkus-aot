package fr.spacefox.perftests.quarkus.data.entity674;

import fr.spacefox.perftests.quarkus.core.service674.model.Model674;

final class Mapper {
    private Mapper() {}

    public static Model674 of(Entity674 entity) {
        return new Model674(entity.getId(), entity.getField());
    }
}
