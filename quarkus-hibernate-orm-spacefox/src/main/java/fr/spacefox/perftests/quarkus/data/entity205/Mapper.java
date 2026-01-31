package fr.spacefox.perftests.quarkus.data.entity205;

import fr.spacefox.perftests.quarkus.core.service205.model.Model205;

final class Mapper {
    private Mapper() {}

    public static Model205 of(Entity205 entity) {
        return new Model205(entity.getId(), entity.getField());
    }
}
