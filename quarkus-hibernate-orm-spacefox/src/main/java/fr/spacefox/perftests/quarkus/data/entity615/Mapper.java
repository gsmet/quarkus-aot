package fr.spacefox.perftests.quarkus.data.entity615;

import fr.spacefox.perftests.quarkus.core.service615.model.Model615;

final class Mapper {
    private Mapper() {}

    public static Model615 of(Entity615 entity) {
        return new Model615(entity.getId(), entity.getField());
    }
}
