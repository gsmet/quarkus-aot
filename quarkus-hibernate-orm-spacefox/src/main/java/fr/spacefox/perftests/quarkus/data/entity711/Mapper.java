package fr.spacefox.perftests.quarkus.data.entity711;

import fr.spacefox.perftests.quarkus.core.service711.model.Model711;

final class Mapper {
    private Mapper() {}

    public static Model711 of(Entity711 entity) {
        return new Model711(entity.getId(), entity.getField());
    }
}
