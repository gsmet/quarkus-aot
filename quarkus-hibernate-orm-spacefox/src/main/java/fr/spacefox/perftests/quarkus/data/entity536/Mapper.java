package fr.spacefox.perftests.quarkus.data.entity536;

import fr.spacefox.perftests.quarkus.core.service536.model.Model536;

final class Mapper {
    private Mapper() {}

    public static Model536 of(Entity536 entity) {
        return new Model536(entity.getId(), entity.getField());
    }
}
