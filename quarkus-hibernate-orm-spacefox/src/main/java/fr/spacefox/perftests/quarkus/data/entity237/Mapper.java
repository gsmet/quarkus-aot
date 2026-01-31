package fr.spacefox.perftests.quarkus.data.entity237;

import fr.spacefox.perftests.quarkus.core.service237.model.Model237;

final class Mapper {
    private Mapper() {}

    public static Model237 of(Entity237 entity) {
        return new Model237(entity.getId(), entity.getField());
    }
}
