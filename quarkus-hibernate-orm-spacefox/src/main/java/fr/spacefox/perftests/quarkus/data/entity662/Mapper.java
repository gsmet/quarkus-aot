package fr.spacefox.perftests.quarkus.data.entity662;

import fr.spacefox.perftests.quarkus.core.service662.model.Model662;

final class Mapper {
    private Mapper() {}

    public static Model662 of(Entity662 entity) {
        return new Model662(entity.getId(), entity.getField());
    }
}
