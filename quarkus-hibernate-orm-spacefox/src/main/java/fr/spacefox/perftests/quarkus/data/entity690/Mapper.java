package fr.spacefox.perftests.quarkus.data.entity690;

import fr.spacefox.perftests.quarkus.core.service690.model.Model690;

final class Mapper {
    private Mapper() {}

    public static Model690 of(Entity690 entity) {
        return new Model690(entity.getId(), entity.getField());
    }
}
