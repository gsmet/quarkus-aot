package fr.spacefox.perftests.quarkus.data.entity754;

import fr.spacefox.perftests.quarkus.core.service754.model.Model754;

final class Mapper {
    private Mapper() {}

    public static Model754 of(Entity754 entity) {
        return new Model754(entity.getId(), entity.getField());
    }
}
