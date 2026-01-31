package fr.spacefox.perftests.quarkus.data.entity555;

import fr.spacefox.perftests.quarkus.core.service555.model.Model555;

final class Mapper {
    private Mapper() {}

    public static Model555 of(Entity555 entity) {
        return new Model555(entity.getId(), entity.getField());
    }
}
