package fr.spacefox.perftests.quarkus.data.entity589;

import fr.spacefox.perftests.quarkus.core.service589.model.Model589;

final class Mapper {
    private Mapper() {}

    public static Model589 of(Entity589 entity) {
        return new Model589(entity.getId(), entity.getField());
    }
}
