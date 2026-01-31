package fr.spacefox.perftests.quarkus.data.entity684;

import fr.spacefox.perftests.quarkus.core.service684.model.Model684;

final class Mapper {
    private Mapper() {}

    public static Model684 of(Entity684 entity) {
        return new Model684(entity.getId(), entity.getField());
    }
}
