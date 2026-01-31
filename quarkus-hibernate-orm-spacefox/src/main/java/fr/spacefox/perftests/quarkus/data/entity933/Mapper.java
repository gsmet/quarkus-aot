package fr.spacefox.perftests.quarkus.data.entity933;

import fr.spacefox.perftests.quarkus.core.service933.model.Model933;

final class Mapper {
    private Mapper() {}

    public static Model933 of(Entity933 entity) {
        return new Model933(entity.getId(), entity.getField());
    }
}
