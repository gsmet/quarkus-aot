package fr.spacefox.perftests.quarkus.data.entity219;

import fr.spacefox.perftests.quarkus.core.service219.model.Model219;

final class Mapper {
    private Mapper() {}

    public static Model219 of(Entity219 entity) {
        return new Model219(entity.getId(), entity.getField());
    }
}
