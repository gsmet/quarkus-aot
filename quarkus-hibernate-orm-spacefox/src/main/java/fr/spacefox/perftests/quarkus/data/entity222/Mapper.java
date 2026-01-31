package fr.spacefox.perftests.quarkus.data.entity222;

import fr.spacefox.perftests.quarkus.core.service222.model.Model222;

final class Mapper {
    private Mapper() {}

    public static Model222 of(Entity222 entity) {
        return new Model222(entity.getId(), entity.getField());
    }
}
