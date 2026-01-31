package fr.spacefox.perftests.quarkus.data.entity289;

import fr.spacefox.perftests.quarkus.core.service289.model.Model289;

final class Mapper {
    private Mapper() {}

    public static Model289 of(Entity289 entity) {
        return new Model289(entity.getId(), entity.getField());
    }
}
