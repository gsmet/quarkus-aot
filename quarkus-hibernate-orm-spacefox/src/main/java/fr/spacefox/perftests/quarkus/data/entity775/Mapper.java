package fr.spacefox.perftests.quarkus.data.entity775;

import fr.spacefox.perftests.quarkus.core.service775.model.Model775;

final class Mapper {
    private Mapper() {}

    public static Model775 of(Entity775 entity) {
        return new Model775(entity.getId(), entity.getField());
    }
}
