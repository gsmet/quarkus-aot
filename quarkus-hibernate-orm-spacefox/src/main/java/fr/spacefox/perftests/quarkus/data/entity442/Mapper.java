package fr.spacefox.perftests.quarkus.data.entity442;

import fr.spacefox.perftests.quarkus.core.service442.model.Model442;

final class Mapper {
    private Mapper() {}

    public static Model442 of(Entity442 entity) {
        return new Model442(entity.getId(), entity.getField());
    }
}
