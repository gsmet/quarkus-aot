package fr.spacefox.perftests.quarkus.data.entity13;

import fr.spacefox.perftests.quarkus.core.service13.model.Model13;

final class Mapper {
    private Mapper() {}

    public static Model13 of(Entity13 entity) {
        return new Model13(entity.getId(), entity.getField());
    }
}
