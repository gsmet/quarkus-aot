package fr.spacefox.perftests.quarkus.data.entity609;

import fr.spacefox.perftests.quarkus.core.service609.model.Model609;

final class Mapper {
    private Mapper() {}

    public static Model609 of(Entity609 entity) {
        return new Model609(entity.getId(), entity.getField());
    }
}
