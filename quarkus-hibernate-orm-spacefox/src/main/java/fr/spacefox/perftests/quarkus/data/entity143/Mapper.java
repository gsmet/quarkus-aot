package fr.spacefox.perftests.quarkus.data.entity143;

import fr.spacefox.perftests.quarkus.core.service143.model.Model143;

final class Mapper {
    private Mapper() {}

    public static Model143 of(Entity143 entity) {
        return new Model143(entity.getId(), entity.getField());
    }
}
