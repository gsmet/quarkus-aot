package fr.spacefox.perftests.quarkus.data.entity847;

import fr.spacefox.perftests.quarkus.core.service847.model.Model847;

final class Mapper {
    private Mapper() {}

    public static Model847 of(Entity847 entity) {
        return new Model847(entity.getId(), entity.getField());
    }
}
