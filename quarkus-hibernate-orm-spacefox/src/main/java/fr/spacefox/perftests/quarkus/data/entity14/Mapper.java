package fr.spacefox.perftests.quarkus.data.entity14;

import fr.spacefox.perftests.quarkus.core.service14.model.Model14;

final class Mapper {
    private Mapper() {}

    public static Model14 of(Entity14 entity) {
        return new Model14(entity.getId(), entity.getField());
    }
}
