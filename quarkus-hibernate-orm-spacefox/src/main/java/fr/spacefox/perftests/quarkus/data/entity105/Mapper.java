package fr.spacefox.perftests.quarkus.data.entity105;

import fr.spacefox.perftests.quarkus.core.service105.model.Model105;

final class Mapper {
    private Mapper() {}

    public static Model105 of(Entity105 entity) {
        return new Model105(entity.getId(), entity.getField());
    }
}
