package fr.spacefox.perftests.quarkus.data.entity42;

import fr.spacefox.perftests.quarkus.core.service42.model.Model42;

final class Mapper {
    private Mapper() {}

    public static Model42 of(Entity42 entity) {
        return new Model42(entity.getId(), entity.getField());
    }
}
