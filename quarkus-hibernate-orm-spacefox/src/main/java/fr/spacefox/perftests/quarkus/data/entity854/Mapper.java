package fr.spacefox.perftests.quarkus.data.entity854;

import fr.spacefox.perftests.quarkus.core.service854.model.Model854;

final class Mapper {
    private Mapper() {}

    public static Model854 of(Entity854 entity) {
        return new Model854(entity.getId(), entity.getField());
    }
}
