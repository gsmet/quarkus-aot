package fr.spacefox.perftests.quarkus.data.entity602;

import fr.spacefox.perftests.quarkus.core.service602.model.Model602;

final class Mapper {
    private Mapper() {}

    public static Model602 of(Entity602 entity) {
        return new Model602(entity.getId(), entity.getField());
    }
}
