package fr.spacefox.perftests.quarkus.data.entity819;

import fr.spacefox.perftests.quarkus.core.service819.model.Model819;

final class Mapper {
    private Mapper() {}

    public static Model819 of(Entity819 entity) {
        return new Model819(entity.getId(), entity.getField());
    }
}
