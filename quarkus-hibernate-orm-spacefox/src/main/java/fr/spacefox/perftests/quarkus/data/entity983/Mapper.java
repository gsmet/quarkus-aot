package fr.spacefox.perftests.quarkus.data.entity983;

import fr.spacefox.perftests.quarkus.core.service983.model.Model983;

final class Mapper {
    private Mapper() {}

    public static Model983 of(Entity983 entity) {
        return new Model983(entity.getId(), entity.getField());
    }
}
