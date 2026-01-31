package fr.spacefox.perftests.quarkus.data.entity985;

import fr.spacefox.perftests.quarkus.core.service985.model.Model985;

final class Mapper {
    private Mapper() {}

    public static Model985 of(Entity985 entity) {
        return new Model985(entity.getId(), entity.getField());
    }
}
