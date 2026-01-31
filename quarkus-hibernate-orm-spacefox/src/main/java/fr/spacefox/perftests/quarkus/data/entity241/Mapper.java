package fr.spacefox.perftests.quarkus.data.entity241;

import fr.spacefox.perftests.quarkus.core.service241.model.Model241;

final class Mapper {
    private Mapper() {}

    public static Model241 of(Entity241 entity) {
        return new Model241(entity.getId(), entity.getField());
    }
}
