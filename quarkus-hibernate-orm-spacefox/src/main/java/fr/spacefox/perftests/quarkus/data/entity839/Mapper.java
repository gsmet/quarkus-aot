package fr.spacefox.perftests.quarkus.data.entity839;

import fr.spacefox.perftests.quarkus.core.service839.model.Model839;

final class Mapper {
    private Mapper() {}

    public static Model839 of(Entity839 entity) {
        return new Model839(entity.getId(), entity.getField());
    }
}
