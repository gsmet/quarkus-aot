package fr.spacefox.perftests.quarkus.data.entity467;

import fr.spacefox.perftests.quarkus.core.service467.model.Model467;

final class Mapper {
    private Mapper() {}

    public static Model467 of(Entity467 entity) {
        return new Model467(entity.getId(), entity.getField());
    }
}
