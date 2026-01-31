package fr.spacefox.perftests.quarkus.data.entity845;

import fr.spacefox.perftests.quarkus.core.service845.model.Model845;

final class Mapper {
    private Mapper() {}

    public static Model845 of(Entity845 entity) {
        return new Model845(entity.getId(), entity.getField());
    }
}
