package fr.spacefox.perftests.quarkus.data.entity719;

import fr.spacefox.perftests.quarkus.core.service719.model.Model719;

final class Mapper {
    private Mapper() {}

    public static Model719 of(Entity719 entity) {
        return new Model719(entity.getId(), entity.getField());
    }
}
