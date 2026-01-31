package fr.spacefox.perftests.quarkus.data.entity550;

import fr.spacefox.perftests.quarkus.core.service550.model.Model550;

final class Mapper {
    private Mapper() {}

    public static Model550 of(Entity550 entity) {
        return new Model550(entity.getId(), entity.getField());
    }
}
