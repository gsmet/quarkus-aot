package fr.spacefox.perftests.quarkus.data.entity726;

import fr.spacefox.perftests.quarkus.core.service726.model.Model726;

final class Mapper {
    private Mapper() {}

    public static Model726 of(Entity726 entity) {
        return new Model726(entity.getId(), entity.getField());
    }
}
