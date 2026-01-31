package fr.spacefox.perftests.quarkus.data.entity6;

import fr.spacefox.perftests.quarkus.core.service6.model.Model6;

final class Mapper {
    private Mapper() {}

    public static Model6 of(Entity6 entity) {
        return new Model6(entity.getId(), entity.getField());
    }
}
