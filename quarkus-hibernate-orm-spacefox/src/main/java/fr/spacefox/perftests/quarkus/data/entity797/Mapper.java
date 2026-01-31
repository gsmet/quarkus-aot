package fr.spacefox.perftests.quarkus.data.entity797;

import fr.spacefox.perftests.quarkus.core.service797.model.Model797;

final class Mapper {
    private Mapper() {}

    public static Model797 of(Entity797 entity) {
        return new Model797(entity.getId(), entity.getField());
    }
}
