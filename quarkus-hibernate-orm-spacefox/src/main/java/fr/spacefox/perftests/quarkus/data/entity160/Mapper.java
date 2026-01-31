package fr.spacefox.perftests.quarkus.data.entity160;

import fr.spacefox.perftests.quarkus.core.service160.model.Model160;

final class Mapper {
    private Mapper() {}

    public static Model160 of(Entity160 entity) {
        return new Model160(entity.getId(), entity.getField());
    }
}
