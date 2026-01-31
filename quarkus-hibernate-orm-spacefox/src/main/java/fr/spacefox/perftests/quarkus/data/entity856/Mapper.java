package fr.spacefox.perftests.quarkus.data.entity856;

import fr.spacefox.perftests.quarkus.core.service856.model.Model856;

final class Mapper {
    private Mapper() {}

    public static Model856 of(Entity856 entity) {
        return new Model856(entity.getId(), entity.getField());
    }
}
