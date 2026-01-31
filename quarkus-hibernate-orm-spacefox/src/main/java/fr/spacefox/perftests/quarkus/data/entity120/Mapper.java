package fr.spacefox.perftests.quarkus.data.entity120;

import fr.spacefox.perftests.quarkus.core.service120.model.Model120;

final class Mapper {
    private Mapper() {}

    public static Model120 of(Entity120 entity) {
        return new Model120(entity.getId(), entity.getField());
    }
}
