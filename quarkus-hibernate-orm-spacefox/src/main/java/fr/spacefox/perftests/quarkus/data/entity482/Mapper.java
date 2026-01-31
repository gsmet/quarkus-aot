package fr.spacefox.perftests.quarkus.data.entity482;

import fr.spacefox.perftests.quarkus.core.service482.model.Model482;

final class Mapper {
    private Mapper() {}

    public static Model482 of(Entity482 entity) {
        return new Model482(entity.getId(), entity.getField());
    }
}
