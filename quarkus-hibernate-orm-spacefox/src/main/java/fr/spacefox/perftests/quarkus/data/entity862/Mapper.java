package fr.spacefox.perftests.quarkus.data.entity862;

import fr.spacefox.perftests.quarkus.core.service862.model.Model862;

final class Mapper {
    private Mapper() {}

    public static Model862 of(Entity862 entity) {
        return new Model862(entity.getId(), entity.getField());
    }
}
