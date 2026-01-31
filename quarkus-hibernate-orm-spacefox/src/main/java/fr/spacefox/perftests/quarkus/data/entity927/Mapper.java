package fr.spacefox.perftests.quarkus.data.entity927;

import fr.spacefox.perftests.quarkus.core.service927.model.Model927;

final class Mapper {
    private Mapper() {}

    public static Model927 of(Entity927 entity) {
        return new Model927(entity.getId(), entity.getField());
    }
}
