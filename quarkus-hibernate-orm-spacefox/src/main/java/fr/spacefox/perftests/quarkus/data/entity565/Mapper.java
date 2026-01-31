package fr.spacefox.perftests.quarkus.data.entity565;

import fr.spacefox.perftests.quarkus.core.service565.model.Model565;

final class Mapper {
    private Mapper() {}

    public static Model565 of(Entity565 entity) {
        return new Model565(entity.getId(), entity.getField());
    }
}
