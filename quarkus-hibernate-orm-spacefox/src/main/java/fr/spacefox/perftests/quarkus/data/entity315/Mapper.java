package fr.spacefox.perftests.quarkus.data.entity315;

import fr.spacefox.perftests.quarkus.core.service315.model.Model315;

final class Mapper {
    private Mapper() {}

    public static Model315 of(Entity315 entity) {
        return new Model315(entity.getId(), entity.getField());
    }
}
