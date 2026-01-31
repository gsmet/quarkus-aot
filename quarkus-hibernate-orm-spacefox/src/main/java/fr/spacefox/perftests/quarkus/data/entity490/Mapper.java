package fr.spacefox.perftests.quarkus.data.entity490;

import fr.spacefox.perftests.quarkus.core.service490.model.Model490;

final class Mapper {
    private Mapper() {}

    public static Model490 of(Entity490 entity) {
        return new Model490(entity.getId(), entity.getField());
    }
}
