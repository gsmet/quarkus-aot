package fr.spacefox.perftests.quarkus.data.entity426;

import fr.spacefox.perftests.quarkus.core.service426.model.Model426;

final class Mapper {
    private Mapper() {}

    public static Model426 of(Entity426 entity) {
        return new Model426(entity.getId(), entity.getField());
    }
}
