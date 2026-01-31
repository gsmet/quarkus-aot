package fr.spacefox.perftests.quarkus.data.entity823;

import fr.spacefox.perftests.quarkus.core.service823.model.Model823;

final class Mapper {
    private Mapper() {}

    public static Model823 of(Entity823 entity) {
        return new Model823(entity.getId(), entity.getField());
    }
}
