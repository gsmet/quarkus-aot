package fr.spacefox.perftests.quarkus.data.entity201;

import fr.spacefox.perftests.quarkus.core.service201.model.Model201;

final class Mapper {
    private Mapper() {}

    public static Model201 of(Entity201 entity) {
        return new Model201(entity.getId(), entity.getField());
    }
}
