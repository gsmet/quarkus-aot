package fr.spacefox.perftests.quarkus.data.entity568;

import fr.spacefox.perftests.quarkus.core.service568.model.Model568;

final class Mapper {
    private Mapper() {}

    public static Model568 of(Entity568 entity) {
        return new Model568(entity.getId(), entity.getField());
    }
}
