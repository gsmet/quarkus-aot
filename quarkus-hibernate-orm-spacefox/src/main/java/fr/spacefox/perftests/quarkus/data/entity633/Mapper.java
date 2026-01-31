package fr.spacefox.perftests.quarkus.data.entity633;

import fr.spacefox.perftests.quarkus.core.service633.model.Model633;

final class Mapper {
    private Mapper() {}

    public static Model633 of(Entity633 entity) {
        return new Model633(entity.getId(), entity.getField());
    }
}
