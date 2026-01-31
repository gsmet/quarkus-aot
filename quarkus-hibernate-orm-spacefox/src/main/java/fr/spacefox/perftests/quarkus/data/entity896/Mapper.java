package fr.spacefox.perftests.quarkus.data.entity896;

import fr.spacefox.perftests.quarkus.core.service896.model.Model896;

final class Mapper {
    private Mapper() {}

    public static Model896 of(Entity896 entity) {
        return new Model896(entity.getId(), entity.getField());
    }
}
