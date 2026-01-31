package fr.spacefox.perftests.quarkus.data.entity76;

import fr.spacefox.perftests.quarkus.core.service76.model.Model76;

final class Mapper {
    private Mapper() {}

    public static Model76 of(Entity76 entity) {
        return new Model76(entity.getId(), entity.getField());
    }
}
