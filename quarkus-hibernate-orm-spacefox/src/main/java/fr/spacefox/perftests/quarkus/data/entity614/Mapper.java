package fr.spacefox.perftests.quarkus.data.entity614;

import fr.spacefox.perftests.quarkus.core.service614.model.Model614;

final class Mapper {
    private Mapper() {}

    public static Model614 of(Entity614 entity) {
        return new Model614(entity.getId(), entity.getField());
    }
}
