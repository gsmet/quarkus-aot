package fr.spacefox.perftests.quarkus.data.entity242;

import fr.spacefox.perftests.quarkus.core.service242.model.Model242;

final class Mapper {
    private Mapper() {}

    public static Model242 of(Entity242 entity) {
        return new Model242(entity.getId(), entity.getField());
    }
}
