package fr.spacefox.perftests.quarkus.data.entity103;

import fr.spacefox.perftests.quarkus.core.service103.model.Model103;

final class Mapper {
    private Mapper() {}

    public static Model103 of(Entity103 entity) {
        return new Model103(entity.getId(), entity.getField());
    }
}
