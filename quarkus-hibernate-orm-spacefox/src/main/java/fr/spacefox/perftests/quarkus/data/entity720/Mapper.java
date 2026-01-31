package fr.spacefox.perftests.quarkus.data.entity720;

import fr.spacefox.perftests.quarkus.core.service720.model.Model720;

final class Mapper {
    private Mapper() {}

    public static Model720 of(Entity720 entity) {
        return new Model720(entity.getId(), entity.getField());
    }
}
