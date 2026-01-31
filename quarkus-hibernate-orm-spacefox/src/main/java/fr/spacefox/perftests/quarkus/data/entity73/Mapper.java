package fr.spacefox.perftests.quarkus.data.entity73;

import fr.spacefox.perftests.quarkus.core.service73.model.Model73;

final class Mapper {
    private Mapper() {}

    public static Model73 of(Entity73 entity) {
        return new Model73(entity.getId(), entity.getField());
    }
}
