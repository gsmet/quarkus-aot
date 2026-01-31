package fr.spacefox.perftests.quarkus.data.entity185;

import fr.spacefox.perftests.quarkus.core.service185.model.Model185;

final class Mapper {
    private Mapper() {}

    public static Model185 of(Entity185 entity) {
        return new Model185(entity.getId(), entity.getField());
    }
}
