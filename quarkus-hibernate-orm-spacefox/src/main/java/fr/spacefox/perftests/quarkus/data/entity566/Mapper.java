package fr.spacefox.perftests.quarkus.data.entity566;

import fr.spacefox.perftests.quarkus.core.service566.model.Model566;

final class Mapper {
    private Mapper() {}

    public static Model566 of(Entity566 entity) {
        return new Model566(entity.getId(), entity.getField());
    }
}
