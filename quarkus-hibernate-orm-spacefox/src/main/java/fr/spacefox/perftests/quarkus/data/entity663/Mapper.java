package fr.spacefox.perftests.quarkus.data.entity663;

import fr.spacefox.perftests.quarkus.core.service663.model.Model663;

final class Mapper {
    private Mapper() {}

    public static Model663 of(Entity663 entity) {
        return new Model663(entity.getId(), entity.getField());
    }
}
