package fr.spacefox.perftests.quarkus.data.entity424;

import fr.spacefox.perftests.quarkus.core.service424.model.Model424;

final class Mapper {
    private Mapper() {}

    public static Model424 of(Entity424 entity) {
        return new Model424(entity.getId(), entity.getField());
    }
}
