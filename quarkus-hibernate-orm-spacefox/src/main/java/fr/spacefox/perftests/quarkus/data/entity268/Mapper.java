package fr.spacefox.perftests.quarkus.data.entity268;

import fr.spacefox.perftests.quarkus.core.service268.model.Model268;

final class Mapper {
    private Mapper() {}

    public static Model268 of(Entity268 entity) {
        return new Model268(entity.getId(), entity.getField());
    }
}
