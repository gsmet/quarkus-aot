package fr.spacefox.perftests.quarkus.data.entity928;

import fr.spacefox.perftests.quarkus.core.service928.model.Model928;

final class Mapper {
    private Mapper() {}

    public static Model928 of(Entity928 entity) {
        return new Model928(entity.getId(), entity.getField());
    }
}
