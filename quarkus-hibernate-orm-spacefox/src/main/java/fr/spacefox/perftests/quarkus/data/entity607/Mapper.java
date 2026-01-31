package fr.spacefox.perftests.quarkus.data.entity607;

import fr.spacefox.perftests.quarkus.core.service607.model.Model607;

final class Mapper {
    private Mapper() {}

    public static Model607 of(Entity607 entity) {
        return new Model607(entity.getId(), entity.getField());
    }
}
