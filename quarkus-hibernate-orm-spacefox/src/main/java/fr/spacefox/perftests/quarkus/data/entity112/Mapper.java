package fr.spacefox.perftests.quarkus.data.entity112;

import fr.spacefox.perftests.quarkus.core.service112.model.Model112;

final class Mapper {
    private Mapper() {}

    public static Model112 of(Entity112 entity) {
        return new Model112(entity.getId(), entity.getField());
    }
}
