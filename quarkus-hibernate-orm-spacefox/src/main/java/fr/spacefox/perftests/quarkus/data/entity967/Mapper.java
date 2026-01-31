package fr.spacefox.perftests.quarkus.data.entity967;

import fr.spacefox.perftests.quarkus.core.service967.model.Model967;

final class Mapper {
    private Mapper() {}

    public static Model967 of(Entity967 entity) {
        return new Model967(entity.getId(), entity.getField());
    }
}
