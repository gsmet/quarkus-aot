package fr.spacefox.perftests.quarkus.data.entity167;

import fr.spacefox.perftests.quarkus.core.service167.model.Model167;

final class Mapper {
    private Mapper() {}

    public static Model167 of(Entity167 entity) {
        return new Model167(entity.getId(), entity.getField());
    }
}
