package fr.spacefox.perftests.quarkus.data.entity114;

import fr.spacefox.perftests.quarkus.core.service114.model.Model114;

final class Mapper {
    private Mapper() {}

    public static Model114 of(Entity114 entity) {
        return new Model114(entity.getId(), entity.getField());
    }
}
