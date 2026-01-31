package fr.spacefox.perftests.quarkus.data.entity463;

import fr.spacefox.perftests.quarkus.core.service463.model.Model463;

final class Mapper {
    private Mapper() {}

    public static Model463 of(Entity463 entity) {
        return new Model463(entity.getId(), entity.getField());
    }
}
