package fr.spacefox.perftests.quarkus.data.entity997;

import fr.spacefox.perftests.quarkus.core.service997.model.Model997;

final class Mapper {
    private Mapper() {}

    public static Model997 of(Entity997 entity) {
        return new Model997(entity.getId(), entity.getField());
    }
}
