package fr.spacefox.perftests.quarkus.data.entity444;

import fr.spacefox.perftests.quarkus.core.service444.model.Model444;

final class Mapper {
    private Mapper() {}

    public static Model444 of(Entity444 entity) {
        return new Model444(entity.getId(), entity.getField());
    }
}
