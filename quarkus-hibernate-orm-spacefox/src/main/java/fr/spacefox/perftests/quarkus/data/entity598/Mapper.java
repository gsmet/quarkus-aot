package fr.spacefox.perftests.quarkus.data.entity598;

import fr.spacefox.perftests.quarkus.core.service598.model.Model598;

final class Mapper {
    private Mapper() {}

    public static Model598 of(Entity598 entity) {
        return new Model598(entity.getId(), entity.getField());
    }
}
