package fr.spacefox.perftests.quarkus.data.entity746;

import fr.spacefox.perftests.quarkus.core.service746.model.Model746;

final class Mapper {
    private Mapper() {}

    public static Model746 of(Entity746 entity) {
        return new Model746(entity.getId(), entity.getField());
    }
}
