package fr.spacefox.perftests.quarkus.data.entity130;

import fr.spacefox.perftests.quarkus.core.service130.model.Model130;

final class Mapper {
    private Mapper() {}

    public static Model130 of(Entity130 entity) {
        return new Model130(entity.getId(), entity.getField());
    }
}
