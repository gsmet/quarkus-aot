package fr.spacefox.perftests.quarkus.data.entity574;

import fr.spacefox.perftests.quarkus.core.service574.model.Model574;

final class Mapper {
    private Mapper() {}

    public static Model574 of(Entity574 entity) {
        return new Model574(entity.getId(), entity.getField());
    }
}
