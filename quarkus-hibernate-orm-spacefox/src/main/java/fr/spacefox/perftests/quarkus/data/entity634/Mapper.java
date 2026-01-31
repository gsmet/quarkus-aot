package fr.spacefox.perftests.quarkus.data.entity634;

import fr.spacefox.perftests.quarkus.core.service634.model.Model634;

final class Mapper {
    private Mapper() {}

    public static Model634 of(Entity634 entity) {
        return new Model634(entity.getId(), entity.getField());
    }
}
