package fr.spacefox.perftests.quarkus.data.entity82;

import fr.spacefox.perftests.quarkus.core.service82.model.Model82;

final class Mapper {
    private Mapper() {}

    public static Model82 of(Entity82 entity) {
        return new Model82(entity.getId(), entity.getField());
    }
}
