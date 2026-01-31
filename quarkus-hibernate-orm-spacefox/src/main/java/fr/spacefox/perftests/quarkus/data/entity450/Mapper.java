package fr.spacefox.perftests.quarkus.data.entity450;

import fr.spacefox.perftests.quarkus.core.service450.model.Model450;

final class Mapper {
    private Mapper() {}

    public static Model450 of(Entity450 entity) {
        return new Model450(entity.getId(), entity.getField());
    }
}
