package fr.spacefox.perftests.quarkus.data.entity808;

import fr.spacefox.perftests.quarkus.core.service808.model.Model808;

final class Mapper {
    private Mapper() {}

    public static Model808 of(Entity808 entity) {
        return new Model808(entity.getId(), entity.getField());
    }
}
