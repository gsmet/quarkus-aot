package fr.spacefox.perftests.quarkus.data.entity484;

import fr.spacefox.perftests.quarkus.core.service484.model.Model484;

final class Mapper {
    private Mapper() {}

    public static Model484 of(Entity484 entity) {
        return new Model484(entity.getId(), entity.getField());
    }
}
