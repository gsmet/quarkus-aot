package fr.spacefox.perftests.quarkus.data.entity54;

import fr.spacefox.perftests.quarkus.core.service54.model.Model54;

final class Mapper {
    private Mapper() {}

    public static Model54 of(Entity54 entity) {
        return new Model54(entity.getId(), entity.getField());
    }
}
