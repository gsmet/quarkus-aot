package fr.spacefox.perftests.quarkus.data.entity951;

import fr.spacefox.perftests.quarkus.core.service951.model.Model951;

final class Mapper {
    private Mapper() {}

    public static Model951 of(Entity951 entity) {
        return new Model951(entity.getId(), entity.getField());
    }
}
