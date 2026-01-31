package fr.spacefox.perftests.quarkus.data.entity305;

import fr.spacefox.perftests.quarkus.core.service305.model.Model305;

final class Mapper {
    private Mapper() {}

    public static Model305 of(Entity305 entity) {
        return new Model305(entity.getId(), entity.getField());
    }
}
