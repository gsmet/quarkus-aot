package fr.spacefox.perftests.quarkus.data.entity319;

import fr.spacefox.perftests.quarkus.core.service319.model.Model319;

final class Mapper {
    private Mapper() {}

    public static Model319 of(Entity319 entity) {
        return new Model319(entity.getId(), entity.getField());
    }
}
