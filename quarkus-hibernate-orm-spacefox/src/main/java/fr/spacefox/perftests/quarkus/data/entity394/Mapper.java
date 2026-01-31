package fr.spacefox.perftests.quarkus.data.entity394;

import fr.spacefox.perftests.quarkus.core.service394.model.Model394;

final class Mapper {
    private Mapper() {}

    public static Model394 of(Entity394 entity) {
        return new Model394(entity.getId(), entity.getField());
    }
}
