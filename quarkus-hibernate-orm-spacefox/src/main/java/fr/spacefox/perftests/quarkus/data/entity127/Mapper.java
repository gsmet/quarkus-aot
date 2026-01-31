package fr.spacefox.perftests.quarkus.data.entity127;

import fr.spacefox.perftests.quarkus.core.service127.model.Model127;

final class Mapper {
    private Mapper() {}

    public static Model127 of(Entity127 entity) {
        return new Model127(entity.getId(), entity.getField());
    }
}
