package fr.spacefox.perftests.quarkus.data.entity623;

import fr.spacefox.perftests.quarkus.core.service623.model.Model623;

final class Mapper {
    private Mapper() {}

    public static Model623 of(Entity623 entity) {
        return new Model623(entity.getId(), entity.getField());
    }
}
