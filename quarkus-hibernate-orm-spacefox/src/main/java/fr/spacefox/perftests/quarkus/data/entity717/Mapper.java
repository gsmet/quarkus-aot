package fr.spacefox.perftests.quarkus.data.entity717;

import fr.spacefox.perftests.quarkus.core.service717.model.Model717;

final class Mapper {
    private Mapper() {}

    public static Model717 of(Entity717 entity) {
        return new Model717(entity.getId(), entity.getField());
    }
}
