package fr.spacefox.perftests.quarkus.data.entity142;

import fr.spacefox.perftests.quarkus.core.service142.model.Model142;

final class Mapper {
    private Mapper() {}

    public static Model142 of(Entity142 entity) {
        return new Model142(entity.getId(), entity.getField());
    }
}
