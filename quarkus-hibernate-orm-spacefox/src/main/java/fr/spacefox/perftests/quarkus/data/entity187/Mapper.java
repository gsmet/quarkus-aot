package fr.spacefox.perftests.quarkus.data.entity187;

import fr.spacefox.perftests.quarkus.core.service187.model.Model187;

final class Mapper {
    private Mapper() {}

    public static Model187 of(Entity187 entity) {
        return new Model187(entity.getId(), entity.getField());
    }
}
