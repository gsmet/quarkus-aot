package fr.spacefox.perftests.quarkus.data.entity980;

import fr.spacefox.perftests.quarkus.core.service980.model.Model980;

final class Mapper {
    private Mapper() {}

    public static Model980 of(Entity980 entity) {
        return new Model980(entity.getId(), entity.getField());
    }
}
