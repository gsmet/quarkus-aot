package fr.spacefox.perftests.quarkus.data.entity636;

import fr.spacefox.perftests.quarkus.core.service636.model.Model636;

final class Mapper {
    private Mapper() {}

    public static Model636 of(Entity636 entity) {
        return new Model636(entity.getId(), entity.getField());
    }
}
