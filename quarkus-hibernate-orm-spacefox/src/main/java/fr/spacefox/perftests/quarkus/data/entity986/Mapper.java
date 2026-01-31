package fr.spacefox.perftests.quarkus.data.entity986;

import fr.spacefox.perftests.quarkus.core.service986.model.Model986;

final class Mapper {
    private Mapper() {}

    public static Model986 of(Entity986 entity) {
        return new Model986(entity.getId(), entity.getField());
    }
}
