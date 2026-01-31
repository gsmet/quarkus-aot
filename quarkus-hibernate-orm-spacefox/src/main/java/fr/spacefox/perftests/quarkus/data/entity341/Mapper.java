package fr.spacefox.perftests.quarkus.data.entity341;

import fr.spacefox.perftests.quarkus.core.service341.model.Model341;

final class Mapper {
    private Mapper() {}

    public static Model341 of(Entity341 entity) {
        return new Model341(entity.getId(), entity.getField());
    }
}
