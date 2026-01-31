package fr.spacefox.perftests.quarkus.data.entity736;

import fr.spacefox.perftests.quarkus.core.service736.model.Model736;

final class Mapper {
    private Mapper() {}

    public static Model736 of(Entity736 entity) {
        return new Model736(entity.getId(), entity.getField());
    }
}
