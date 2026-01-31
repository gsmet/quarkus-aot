package fr.spacefox.perftests.quarkus.data.entity272;

import fr.spacefox.perftests.quarkus.core.service272.model.Model272;

final class Mapper {
    private Mapper() {}

    public static Model272 of(Entity272 entity) {
        return new Model272(entity.getId(), entity.getField());
    }
}
