package fr.spacefox.perftests.quarkus.data.entity74;

import fr.spacefox.perftests.quarkus.core.service74.model.Model74;

final class Mapper {
    private Mapper() {}

    public static Model74 of(Entity74 entity) {
        return new Model74(entity.getId(), entity.getField());
    }
}
