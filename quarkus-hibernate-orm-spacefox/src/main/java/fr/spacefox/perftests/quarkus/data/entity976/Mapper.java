package fr.spacefox.perftests.quarkus.data.entity976;

import fr.spacefox.perftests.quarkus.core.service976.model.Model976;

final class Mapper {
    private Mapper() {}

    public static Model976 of(Entity976 entity) {
        return new Model976(entity.getId(), entity.getField());
    }
}
