package fr.spacefox.perftests.quarkus.data.entity744;

import fr.spacefox.perftests.quarkus.core.service744.model.Model744;

final class Mapper {
    private Mapper() {}

    public static Model744 of(Entity744 entity) {
        return new Model744(entity.getId(), entity.getField());
    }
}
