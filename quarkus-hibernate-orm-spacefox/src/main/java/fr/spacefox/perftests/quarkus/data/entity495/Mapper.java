package fr.spacefox.perftests.quarkus.data.entity495;

import fr.spacefox.perftests.quarkus.core.service495.model.Model495;

final class Mapper {
    private Mapper() {}

    public static Model495 of(Entity495 entity) {
        return new Model495(entity.getId(), entity.getField());
    }
}
