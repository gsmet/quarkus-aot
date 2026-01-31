package fr.spacefox.perftests.quarkus.data.entity448;

import fr.spacefox.perftests.quarkus.core.service448.model.Model448;

final class Mapper {
    private Mapper() {}

    public static Model448 of(Entity448 entity) {
        return new Model448(entity.getId(), entity.getField());
    }
}
