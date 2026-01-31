package fr.spacefox.perftests.quarkus.data.entity302;

import fr.spacefox.perftests.quarkus.core.service302.model.Model302;

final class Mapper {
    private Mapper() {}

    public static Model302 of(Entity302 entity) {
        return new Model302(entity.getId(), entity.getField());
    }
}
