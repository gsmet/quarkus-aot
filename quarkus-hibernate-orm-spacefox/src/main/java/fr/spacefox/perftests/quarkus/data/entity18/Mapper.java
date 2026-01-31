package fr.spacefox.perftests.quarkus.data.entity18;

import fr.spacefox.perftests.quarkus.core.service18.model.Model18;

final class Mapper {
    private Mapper() {}

    public static Model18 of(Entity18 entity) {
        return new Model18(entity.getId(), entity.getField());
    }
}
