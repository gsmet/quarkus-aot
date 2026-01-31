package fr.spacefox.perftests.quarkus.data.entity579;

import fr.spacefox.perftests.quarkus.core.service579.model.Model579;

final class Mapper {
    private Mapper() {}

    public static Model579 of(Entity579 entity) {
        return new Model579(entity.getId(), entity.getField());
    }
}
