package fr.spacefox.perftests.quarkus.data.entity48;

import fr.spacefox.perftests.quarkus.core.service48.model.Model48;

final class Mapper {
    private Mapper() {}

    public static Model48 of(Entity48 entity) {
        return new Model48(entity.getId(), entity.getField());
    }
}
