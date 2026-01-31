package fr.spacefox.perftests.quarkus.data.entity159;

import fr.spacefox.perftests.quarkus.core.service159.model.Model159;

final class Mapper {
    private Mapper() {}

    public static Model159 of(Entity159 entity) {
        return new Model159(entity.getId(), entity.getField());
    }
}
