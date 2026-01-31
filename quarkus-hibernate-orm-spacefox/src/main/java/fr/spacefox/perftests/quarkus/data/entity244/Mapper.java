package fr.spacefox.perftests.quarkus.data.entity244;

import fr.spacefox.perftests.quarkus.core.service244.model.Model244;

final class Mapper {
    private Mapper() {}

    public static Model244 of(Entity244 entity) {
        return new Model244(entity.getId(), entity.getField());
    }
}
