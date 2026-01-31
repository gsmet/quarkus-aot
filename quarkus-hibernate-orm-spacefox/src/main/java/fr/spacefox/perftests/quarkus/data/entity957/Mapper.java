package fr.spacefox.perftests.quarkus.data.entity957;

import fr.spacefox.perftests.quarkus.core.service957.model.Model957;

final class Mapper {
    private Mapper() {}

    public static Model957 of(Entity957 entity) {
        return new Model957(entity.getId(), entity.getField());
    }
}
