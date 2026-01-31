package fr.spacefox.perftests.quarkus.data.entity345;

import fr.spacefox.perftests.quarkus.core.service345.model.Model345;

final class Mapper {
    private Mapper() {}

    public static Model345 of(Entity345 entity) {
        return new Model345(entity.getId(), entity.getField());
    }
}
