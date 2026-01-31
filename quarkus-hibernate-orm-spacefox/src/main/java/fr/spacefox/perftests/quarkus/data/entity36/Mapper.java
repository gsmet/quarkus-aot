package fr.spacefox.perftests.quarkus.data.entity36;

import fr.spacefox.perftests.quarkus.core.service36.model.Model36;

final class Mapper {
    private Mapper() {}

    public static Model36 of(Entity36 entity) {
        return new Model36(entity.getId(), entity.getField());
    }
}
