package fr.spacefox.perftests.quarkus.data.entity174;

import fr.spacefox.perftests.quarkus.core.service174.model.Model174;

final class Mapper {
    private Mapper() {}

    public static Model174 of(Entity174 entity) {
        return new Model174(entity.getId(), entity.getField());
    }
}
