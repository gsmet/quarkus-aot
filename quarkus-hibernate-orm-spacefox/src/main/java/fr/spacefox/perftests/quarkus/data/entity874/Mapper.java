package fr.spacefox.perftests.quarkus.data.entity874;

import fr.spacefox.perftests.quarkus.core.service874.model.Model874;

final class Mapper {
    private Mapper() {}

    public static Model874 of(Entity874 entity) {
        return new Model874(entity.getId(), entity.getField());
    }
}
