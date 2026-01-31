package fr.spacefox.perftests.quarkus.data.entity871;

import fr.spacefox.perftests.quarkus.core.service871.model.Model871;

final class Mapper {
    private Mapper() {}

    public static Model871 of(Entity871 entity) {
        return new Model871(entity.getId(), entity.getField());
    }
}
