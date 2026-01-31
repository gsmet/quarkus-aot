package fr.spacefox.perftests.quarkus.data.entity695;

import fr.spacefox.perftests.quarkus.core.service695.model.Model695;

final class Mapper {
    private Mapper() {}

    public static Model695 of(Entity695 entity) {
        return new Model695(entity.getId(), entity.getField());
    }
}
