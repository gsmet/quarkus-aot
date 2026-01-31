package fr.spacefox.perftests.quarkus.data.entity385;

import fr.spacefox.perftests.quarkus.core.service385.model.Model385;

final class Mapper {
    private Mapper() {}

    public static Model385 of(Entity385 entity) {
        return new Model385(entity.getId(), entity.getField());
    }
}
