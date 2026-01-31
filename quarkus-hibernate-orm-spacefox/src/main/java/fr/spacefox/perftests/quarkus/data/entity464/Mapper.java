package fr.spacefox.perftests.quarkus.data.entity464;

import fr.spacefox.perftests.quarkus.core.service464.model.Model464;

final class Mapper {
    private Mapper() {}

    public static Model464 of(Entity464 entity) {
        return new Model464(entity.getId(), entity.getField());
    }
}
