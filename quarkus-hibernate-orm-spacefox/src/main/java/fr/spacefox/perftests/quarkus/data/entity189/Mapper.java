package fr.spacefox.perftests.quarkus.data.entity189;

import fr.spacefox.perftests.quarkus.core.service189.model.Model189;

final class Mapper {
    private Mapper() {}

    public static Model189 of(Entity189 entity) {
        return new Model189(entity.getId(), entity.getField());
    }
}
