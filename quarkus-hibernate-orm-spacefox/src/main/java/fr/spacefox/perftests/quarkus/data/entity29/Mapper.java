package fr.spacefox.perftests.quarkus.data.entity29;

import fr.spacefox.perftests.quarkus.core.service29.model.Model29;

final class Mapper {
    private Mapper() {}

    public static Model29 of(Entity29 entity) {
        return new Model29(entity.getId(), entity.getField());
    }
}
