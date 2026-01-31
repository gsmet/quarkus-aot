package fr.spacefox.perftests.quarkus.data.entity799;

import fr.spacefox.perftests.quarkus.core.service799.model.Model799;

final class Mapper {
    private Mapper() {}

    public static Model799 of(Entity799 entity) {
        return new Model799(entity.getId(), entity.getField());
    }
}
