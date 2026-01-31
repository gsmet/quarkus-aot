package fr.spacefox.perftests.quarkus.data.entity593;

import fr.spacefox.perftests.quarkus.core.service593.model.Model593;

final class Mapper {
    private Mapper() {}

    public static Model593 of(Entity593 entity) {
        return new Model593(entity.getId(), entity.getField());
    }
}
