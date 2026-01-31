package fr.spacefox.perftests.quarkus.data.entity23;

import fr.spacefox.perftests.quarkus.core.service23.model.Model23;

final class Mapper {
    private Mapper() {}

    public static Model23 of(Entity23 entity) {
        return new Model23(entity.getId(), entity.getField());
    }
}
