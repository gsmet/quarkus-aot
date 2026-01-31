package fr.spacefox.perftests.quarkus.data.entity263;

import fr.spacefox.perftests.quarkus.core.service263.model.Model263;

final class Mapper {
    private Mapper() {}

    public static Model263 of(Entity263 entity) {
        return new Model263(entity.getId(), entity.getField());
    }
}
