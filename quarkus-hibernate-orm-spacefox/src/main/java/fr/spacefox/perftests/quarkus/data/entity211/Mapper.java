package fr.spacefox.perftests.quarkus.data.entity211;

import fr.spacefox.perftests.quarkus.core.service211.model.Model211;

final class Mapper {
    private Mapper() {}

    public static Model211 of(Entity211 entity) {
        return new Model211(entity.getId(), entity.getField());
    }
}
