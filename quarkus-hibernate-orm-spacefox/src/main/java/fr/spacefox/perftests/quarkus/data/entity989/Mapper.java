package fr.spacefox.perftests.quarkus.data.entity989;

import fr.spacefox.perftests.quarkus.core.service989.model.Model989;

final class Mapper {
    private Mapper() {}

    public static Model989 of(Entity989 entity) {
        return new Model989(entity.getId(), entity.getField());
    }
}
