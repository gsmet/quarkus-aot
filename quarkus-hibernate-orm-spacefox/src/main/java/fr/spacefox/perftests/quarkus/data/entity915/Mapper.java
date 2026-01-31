package fr.spacefox.perftests.quarkus.data.entity915;

import fr.spacefox.perftests.quarkus.core.service915.model.Model915;

final class Mapper {
    private Mapper() {}

    public static Model915 of(Entity915 entity) {
        return new Model915(entity.getId(), entity.getField());
    }
}
