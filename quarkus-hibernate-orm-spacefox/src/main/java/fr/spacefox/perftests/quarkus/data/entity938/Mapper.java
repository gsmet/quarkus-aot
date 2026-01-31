package fr.spacefox.perftests.quarkus.data.entity938;

import fr.spacefox.perftests.quarkus.core.service938.model.Model938;

final class Mapper {
    private Mapper() {}

    public static Model938 of(Entity938 entity) {
        return new Model938(entity.getId(), entity.getField());
    }
}
