package fr.spacefox.perftests.quarkus.data.entity631;

import fr.spacefox.perftests.quarkus.core.service631.model.Model631;

final class Mapper {
    private Mapper() {}

    public static Model631 of(Entity631 entity) {
        return new Model631(entity.getId(), entity.getField());
    }
}
