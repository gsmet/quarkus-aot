package fr.spacefox.perftests.quarkus.data.entity807;

import fr.spacefox.perftests.quarkus.core.service807.model.Model807;

final class Mapper {
    private Mapper() {}

    public static Model807 of(Entity807 entity) {
        return new Model807(entity.getId(), entity.getField());
    }
}
