package fr.spacefox.perftests.quarkus.data.entity689;

import fr.spacefox.perftests.quarkus.core.service689.model.Model689;

final class Mapper {
    private Mapper() {}

    public static Model689 of(Entity689 entity) {
        return new Model689(entity.getId(), entity.getField());
    }
}
