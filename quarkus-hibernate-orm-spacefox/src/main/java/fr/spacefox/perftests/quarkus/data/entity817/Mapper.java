package fr.spacefox.perftests.quarkus.data.entity817;

import fr.spacefox.perftests.quarkus.core.service817.model.Model817;

final class Mapper {
    private Mapper() {}

    public static Model817 of(Entity817 entity) {
        return new Model817(entity.getId(), entity.getField());
    }
}
