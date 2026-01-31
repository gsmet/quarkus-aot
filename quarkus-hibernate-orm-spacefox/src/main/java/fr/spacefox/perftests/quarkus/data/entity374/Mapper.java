package fr.spacefox.perftests.quarkus.data.entity374;

import fr.spacefox.perftests.quarkus.core.service374.model.Model374;

final class Mapper {
    private Mapper() {}

    public static Model374 of(Entity374 entity) {
        return new Model374(entity.getId(), entity.getField());
    }
}
