package fr.spacefox.perftests.quarkus.data.entity414;

import fr.spacefox.perftests.quarkus.core.service414.model.Model414;

final class Mapper {
    private Mapper() {}

    public static Model414 of(Entity414 entity) {
        return new Model414(entity.getId(), entity.getField());
    }
}
