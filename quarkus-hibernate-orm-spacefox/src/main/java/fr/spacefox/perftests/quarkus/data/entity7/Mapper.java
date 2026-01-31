package fr.spacefox.perftests.quarkus.data.entity7;

import fr.spacefox.perftests.quarkus.core.service7.model.Model7;

final class Mapper {
    private Mapper() {}

    public static Model7 of(Entity7 entity) {
        return new Model7(entity.getId(), entity.getField());
    }
}
