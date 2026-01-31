package fr.spacefox.perftests.quarkus.data.entity640;

import fr.spacefox.perftests.quarkus.core.service640.model.Model640;

final class Mapper {
    private Mapper() {}

    public static Model640 of(Entity640 entity) {
        return new Model640(entity.getId(), entity.getField());
    }
}
