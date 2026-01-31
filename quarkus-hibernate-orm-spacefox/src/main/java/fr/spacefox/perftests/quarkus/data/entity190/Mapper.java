package fr.spacefox.perftests.quarkus.data.entity190;

import fr.spacefox.perftests.quarkus.core.service190.model.Model190;

final class Mapper {
    private Mapper() {}

    public static Model190 of(Entity190 entity) {
        return new Model190(entity.getId(), entity.getField());
    }
}
