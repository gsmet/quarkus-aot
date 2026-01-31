package fr.spacefox.perftests.quarkus.data.entity119;

import fr.spacefox.perftests.quarkus.core.service119.model.Model119;

final class Mapper {
    private Mapper() {}

    public static Model119 of(Entity119 entity) {
        return new Model119(entity.getId(), entity.getField());
    }
}
