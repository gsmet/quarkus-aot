package fr.spacefox.perftests.quarkus.data.entity734;

import fr.spacefox.perftests.quarkus.core.service734.model.Model734;

final class Mapper {
    private Mapper() {}

    public static Model734 of(Entity734 entity) {
        return new Model734(entity.getId(), entity.getField());
    }
}
