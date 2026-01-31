package fr.spacefox.perftests.quarkus.data.entity364;

import fr.spacefox.perftests.quarkus.core.service364.model.Model364;

final class Mapper {
    private Mapper() {}

    public static Model364 of(Entity364 entity) {
        return new Model364(entity.getId(), entity.getField());
    }
}
