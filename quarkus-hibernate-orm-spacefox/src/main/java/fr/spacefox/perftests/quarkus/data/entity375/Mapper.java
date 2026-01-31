package fr.spacefox.perftests.quarkus.data.entity375;

import fr.spacefox.perftests.quarkus.core.service375.model.Model375;

final class Mapper {
    private Mapper() {}

    public static Model375 of(Entity375 entity) {
        return new Model375(entity.getId(), entity.getField());
    }
}
