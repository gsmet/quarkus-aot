package fr.spacefox.perftests.quarkus.data.entity66;

import fr.spacefox.perftests.quarkus.core.service66.model.Model66;

final class Mapper {
    private Mapper() {}

    public static Model66 of(Entity66 entity) {
        return new Model66(entity.getId(), entity.getField());
    }
}
