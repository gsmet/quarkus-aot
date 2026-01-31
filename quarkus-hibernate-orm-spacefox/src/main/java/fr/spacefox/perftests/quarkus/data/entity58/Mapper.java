package fr.spacefox.perftests.quarkus.data.entity58;

import fr.spacefox.perftests.quarkus.core.service58.model.Model58;

final class Mapper {
    private Mapper() {}

    public static Model58 of(Entity58 entity) {
        return new Model58(entity.getId(), entity.getField());
    }
}
