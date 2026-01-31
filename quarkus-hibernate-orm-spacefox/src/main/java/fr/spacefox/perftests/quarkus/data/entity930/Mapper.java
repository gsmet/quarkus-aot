package fr.spacefox.perftests.quarkus.data.entity930;

import fr.spacefox.perftests.quarkus.core.service930.model.Model930;

final class Mapper {
    private Mapper() {}

    public static Model930 of(Entity930 entity) {
        return new Model930(entity.getId(), entity.getField());
    }
}
