package fr.spacefox.perftests.quarkus.data.entity15;

import fr.spacefox.perftests.quarkus.core.service15.model.Model15;

final class Mapper {
    private Mapper() {}

    public static Model15 of(Entity15 entity) {
        return new Model15(entity.getId(), entity.getField());
    }
}
