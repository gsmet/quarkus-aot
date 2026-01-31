package fr.spacefox.perftests.quarkus.data.entity4;

import fr.spacefox.perftests.quarkus.core.service4.model.Model4;

final class Mapper {
    private Mapper() {}

    public static Model4 of(Entity4 entity) {
        return new Model4(entity.getId(), entity.getField());
    }
}
