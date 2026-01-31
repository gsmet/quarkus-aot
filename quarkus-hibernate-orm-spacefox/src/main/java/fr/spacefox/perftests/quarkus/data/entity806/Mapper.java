package fr.spacefox.perftests.quarkus.data.entity806;

import fr.spacefox.perftests.quarkus.core.service806.model.Model806;

final class Mapper {
    private Mapper() {}

    public static Model806 of(Entity806 entity) {
        return new Model806(entity.getId(), entity.getField());
    }
}
