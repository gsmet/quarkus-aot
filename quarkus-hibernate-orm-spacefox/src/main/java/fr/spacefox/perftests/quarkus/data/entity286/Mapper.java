package fr.spacefox.perftests.quarkus.data.entity286;

import fr.spacefox.perftests.quarkus.core.service286.model.Model286;

final class Mapper {
    private Mapper() {}

    public static Model286 of(Entity286 entity) {
        return new Model286(entity.getId(), entity.getField());
    }
}
