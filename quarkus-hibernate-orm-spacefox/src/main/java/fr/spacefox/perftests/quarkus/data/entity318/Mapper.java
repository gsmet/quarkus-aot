package fr.spacefox.perftests.quarkus.data.entity318;

import fr.spacefox.perftests.quarkus.core.service318.model.Model318;

final class Mapper {
    private Mapper() {}

    public static Model318 of(Entity318 entity) {
        return new Model318(entity.getId(), entity.getField());
    }
}
