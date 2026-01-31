package fr.spacefox.perftests.quarkus.data.entity207;

import fr.spacefox.perftests.quarkus.core.service207.model.Model207;

final class Mapper {
    private Mapper() {}

    public static Model207 of(Entity207 entity) {
        return new Model207(entity.getId(), entity.getField());
    }
}
