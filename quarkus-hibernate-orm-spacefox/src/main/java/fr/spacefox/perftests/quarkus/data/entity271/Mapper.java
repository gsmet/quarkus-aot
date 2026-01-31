package fr.spacefox.perftests.quarkus.data.entity271;

import fr.spacefox.perftests.quarkus.core.service271.model.Model271;

final class Mapper {
    private Mapper() {}

    public static Model271 of(Entity271 entity) {
        return new Model271(entity.getId(), entity.getField());
    }
}
